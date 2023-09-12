package com.ex.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
public class Student {
	
	@Id
	@NonNull
	private Integer stdId;
	private String stdName;
	private String stdEmail;

	@ManyToMany
	@JoinTable(name="std_crs_tab",
	joinColumns = @JoinColumn(name="stdIdFk"),
	inverseJoinColumns= @JoinColumn(name="courseIdFk"))
	private List<Course> courses;
}
