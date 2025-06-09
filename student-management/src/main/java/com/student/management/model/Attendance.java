package com.student.management.model;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	private Student student;

	@ManyToOne
	private Course course;

	private LocalDate date;

	private String status; // PRESENT or ABSENT
}


//
//@ManyToOne private Student student;
//One student can have many attendance records.
//
//So, Many Attendance entries → One Student.
//
//🔸 @ManyToOne private Course course;
//One course will be referenced in many attendance records.
//
//So, Many Attendance entries → One Course.