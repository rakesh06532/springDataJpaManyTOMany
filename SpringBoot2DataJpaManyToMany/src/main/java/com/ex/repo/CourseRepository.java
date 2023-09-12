package com.ex.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	
	Course findByCourseId(Integer courseId);

}
