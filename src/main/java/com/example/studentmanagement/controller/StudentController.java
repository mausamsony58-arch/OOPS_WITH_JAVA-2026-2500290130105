package com.example.studentmanagement.controller;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 1. Add Student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // 2. Get All Students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // 3. Get Student By ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // 4. Search Student By Email
    @GetMapping("/email/{email}")
    public Student getStudentByEmail(@PathVariable String email) {
        return studentService.getStudentByEmail(email);
    }

    // 5. Search Students By Course
    @GetMapping("/course/{courseName}")
    public List<Student> getStudentsByCourse(@PathVariable String courseName) {
        return studentService.getStudentsByCourse(courseName);
    }

    // 6. Update Student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    // 7. Delete Student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }

    // 8. Merit List
    @GetMapping("/merit-list")
    public List<Student> getMeritList() {
        return studentService.getMeritList();
    }

    // 9. Search Students By Technical Skill
    @GetMapping("/skill/{skill}")
    public List<Student> getStudentsBySkill(@PathVariable String skill) {
        return studentService.getStudentsBySkill(skill);
    }

    // 10. Programming Needs Improvement
    @GetMapping("/programming-needs-improvement")
    public List<Student> getStudentsWithProgrammingNeedsImprovement() {
        return studentService.getStudentsWithProgrammingNeedsImprovement();
    }

    // 11. Group Students By Same Technical Skills
    @GetMapping("/group-by-skills")
    public Map<String, List<Student>> getStudentsGroupedBySkill() {
        return studentService.getStudentsGroupedBySkill();
    }
}