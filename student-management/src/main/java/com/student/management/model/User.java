package com.student.management.model;

import lombok.Data;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank(message = "Email is required")
	@Email(message = "Enter a valid email")
	@Column(unique = true)

	private String email;

	private String password;
	private String role; // (ADMIN/TEACHER/STUDENT)

}
