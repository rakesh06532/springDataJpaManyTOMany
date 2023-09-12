package com.ex.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ex.model.Course;
import com.ex.repo.CourseRepository;

@Component
public class CourseTestRunner implements CommandLineRunner {
	
	@Autowired
	private CourseRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Course(101,"Core Java",4,4000.0));
		repo.save(new Course(102,"Ad Java",2,3000.0));
		repo.save(new Course(103,"Spring",5,5000.0));
		repo.save(new Course(104,"HTML",3,2000.0));

	}

}
