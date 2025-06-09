package com.student.management.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Grade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	private Student student;

	@ManyToOne
	private Course course;

	private String examName;
	private double marks;
	private String grade;
	private double gpa;
}

//
//@ManyToOne private Student student;
//One student can have many grade records (for different courses/exams).
//
//So, many Grades → one Student.
//
//🔸 @ManyToOne private Course course;
//One course will appear in many grade records (for different students).
//
//So, many Grades → one Course.