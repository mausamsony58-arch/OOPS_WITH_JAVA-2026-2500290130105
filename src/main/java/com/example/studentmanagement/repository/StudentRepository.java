package com.example.studentmanagement.repository;

import com.example.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmail(String email);

    List<Student> findByCourseName(String courseName);

    List<Student> findByTechnicalSkillsContaining(String skill);

    List<Student> findByProgrammingScoreLessThanAndMathematicsScoreGreaterThanEqual(
            double programmingScore, double mathematicsScore);
}