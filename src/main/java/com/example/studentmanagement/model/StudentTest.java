package com.example.studentmanagement.model;

import java.util.Arrays;

public class StudentTest {

    public static void main(String[] args) {

        Student s1 = new Student(
                101L,
                "Mausam",
                "mausam@gmail.com",
                "B.Tech IT",
                90,
                80,
                Arrays.asList("Java", "Python", "Spring Boot")
        );

        System.out.println("Student ID: " + s1.getStudentId());
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("Email: " + s1.getEmail());
        System.out.println("Course: " + s1.getCourseName());

        System.out.println("Programming: " + s1.getProgrammingScore());
        System.out.println("Mathematics: " + s1.getMathematicsScore());

        System.out.println("Skills: " + s1.getTechnicalSkills());

        System.out.println("Average: " + s1.calculateAverage());

        System.out.println("Category: " + s1.getCategory());

        System.out.println("Stronger Subject: " + s1.strongerSubject());
    }
}