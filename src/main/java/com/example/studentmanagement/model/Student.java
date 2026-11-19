package com.example.studentmanagement.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private Long studentId;

    private String studentName;

    @Column(unique = true)
    private String email;

    private String courseName;

    private double programmingScore;

    private double mathematicsScore;

    @ElementCollection
    private List<String> technicalSkills = new ArrayList<>();

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(Long studentId, String studentName,
                   String email, String courseName,
                   double programmingScore,
                   double mathematicsScore,
                   List<String> technicalSkills) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.courseName = courseName;
        this.programmingScore = programmingScore;
        this.mathematicsScore = mathematicsScore;
        this.technicalSkills = technicalSkills;
    }

    // Getters and Setters

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getProgrammingScore() {
        return programmingScore;
    }

    public void setProgrammingScore(double programmingScore) {
        this.programmingScore = programmingScore;
    }

    public double getMathematicsScore() {
        return mathematicsScore;
    }

    public void setMathematicsScore(double mathematicsScore) {
        this.mathematicsScore = mathematicsScore;
    }

    public List<String> getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(List<String> technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    // Calculate Average
    public double calculateAverage() {
        return (programmingScore + mathematicsScore) / 2;
    }

    // Performance Category
    public String getCategory() {

        double avg = calculateAverage();

        if (avg >= 85)
            return "Excellent";
        else if (avg >= 70)
            return "Good";
        else if (avg >= 50)
            return "Satisfactory";
        else
            return "Needs Improvement";
    }

    // Stronger Subject
    public String strongerSubject() {

        if (programmingScore > mathematicsScore)
            return "Programming";
        else if (mathematicsScore > programmingScore)
            return "Mathematics";
        else
            return "Both Equal";
    }
}