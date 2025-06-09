package com.student.management.model;

import lombok.Data;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int fullName;

	private String email;

	private String phone;

	private String gender;

	private String dateOfBirth; // or LocalDate if you're using Java 8+

	private String address;

	private String profileImageUrl; // for photo uploads

	@OneToOne
	private User user; // Link to login details if needed

	@ManyToMany
	private List<Course> enrolledCourses; // Optional: for reverse mapping

	// Other fields based on needs .
}

//A Student has one User account (for login).
//A Teacher has one User account.

//One student can enroll in many courses.
//One course can have many students