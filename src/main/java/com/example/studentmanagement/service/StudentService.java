package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // 1. Add Student
    public Student addStudent(Student student) {

        if (studentRepository.existsById(student.getStudentId())) {
            throw new RuntimeException("Student ID already exists");
        }

        if (student.getProgrammingScore() < 0 ||
                student.getProgrammingScore() > 100 ||
                student.getMathematicsScore() < 0 ||
                student.getMathematicsScore() > 100) {

            throw new RuntimeException("Score must be between 0 and 100");
        }

        return studentRepository.save(student);
    }

    // 2. Get All Students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // 3. Search Student By ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    // 4. Update Student
    public Student updateStudent(Long id, Student updatedStudent) {

        Student student = getStudentById(id);

        if (updatedStudent.getProgrammingScore() < 0 ||
                updatedStudent.getProgrammingScore() > 100 ||
                updatedStudent.getMathematicsScore() < 0 ||
                updatedStudent.getMathematicsScore() > 100) {

            throw new RuntimeException("Score must be between 0 and 100");
        }

        student.setProgrammingScore(updatedStudent.getProgrammingScore());
        student.setMathematicsScore(updatedStudent.getMathematicsScore());
        student.setTechnicalSkills(updatedStudent.getTechnicalSkills());

        return studentRepository.save(student);
    }

    // 5. Delete Student
    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }

    // 6. Search Student By Email
    public Student getStudentByEmail(String email) {
        return studentRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    // 7. Search Students By Course
    public List<Student> getStudentsByCourse(String courseName) {
        return studentRepository.findByCourseName(courseName);
    }

    // 8. Merit List
    public List<Student> getMeritList() {

        List<Student> students = studentRepository.findAll();

        students.sort(Comparator.comparingDouble(
                Student::calculateAverage).reversed());

        return students;
    }

    // 9. Search Students By Technical Skill
    public List<Student> getStudentsBySkill(String skill) {
        return studentRepository.findByTechnicalSkillsContaining(skill);
    }

    // 10. Programming Needs Improvement
    public List<Student> getStudentsWithProgrammingNeedsImprovement() {
        return studentRepository
                .findByProgrammingScoreLessThanAndMathematicsScoreGreaterThanEqual(50, 75);
    }

    // 11. Group Students By Same Technical Skills
    public Map<String, List<Student>> getStudentsGroupedBySkill() {

        List<Student> students = studentRepository.findAll();

        Map<String, List<Student>> skillMap = new HashMap<>();

        for (Student student : students) {

            for (String skill : student.getTechnicalSkills()) {

                skillMap.putIfAbsent(skill, new ArrayList<>());

                skillMap.get(skill).add(student);
            }
        }

        return skillMap;
    }
}