package com.ex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Course {
	
	@Id
	@NonNull
	private Integer courseId;
	private String courseName;
	private Integer courseDuration;
	private Double courseCost;

}
