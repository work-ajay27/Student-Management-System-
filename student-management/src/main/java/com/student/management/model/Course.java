package com.student.management.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@Entity
public class Course {
	private int id;
	private String courseName;
	private String description;

	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private User teacher; // Teacher is also a User
}



//✅ @ManyToOne
//Means: Many courses can be taught by one teacher.
//
//Each Course object will have one teacher (User with role = "TEACHER").
//
//But the same teacher can teach multiple courses.
//
//✅ @JoinColumn(name = "teacher_id")
//Creates a foreign key column named teacher_id in the course table.
//
//This column stores the ID of the User (teacher) who teaches the course.
//
//✅ Why User teacher?
//Instead of creating a separate Teacher table, you use the User table for all roles: ADMIN, TEACHER, STUDENT.
//
//So the teacher is just a User with role = "TEACHER".

