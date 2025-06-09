package com.student.management.model;

import lombok.*;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Data
@Entity
public class Enrollment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	private Student student;

	@ManyToOne
	private Course couse;

	private LocalDateTime enrollAt;

}

//To track which student joined which course, and when.

//@ManyToOne private Student student;
//Many enrollments can be for the same student.
//
//Example: A student joins 3 courses → 3 rows in the enrollment table.
//
// @ManyToOne private Course course;
//Many enrollments can be for the same course.
//
//Example: 10 students enroll in "Math" → 10 rows for the same course.
//
// enrolledAt
//Stores the date and time when the student enrolled.