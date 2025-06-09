package com.student.management.model;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Announcement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String title;
	private String message;

	@ManyToOne
	private User postedBy;

	private String targetRole; // STUDENT / TEACHER / ALL

	private LocalDateTime date;
}
