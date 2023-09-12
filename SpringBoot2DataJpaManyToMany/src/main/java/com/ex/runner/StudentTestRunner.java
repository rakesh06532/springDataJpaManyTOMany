package com.ex.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ex.model.Student;
import com.ex.repo.CourseRepository;
import com.ex.repo.StudentRepository;

@Component
public class StudentTestRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRepository repo;
	
	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student std=new Student();
		std.setStdId(1001);
		std.setStdName("Rakesh");
		std.setStdEmail("ra@gmail.com");
		
		std.setCourses(Arrays.asList(
				courseRepo.findByCourseId(101),
				courseRepo.findByCourseId(102),
				courseRepo.findByCourseId(103))
				);
		
		repo.save(std);
		
		Student std2=new Student();
		std2.setStdId(1002);
		std2.setStdName("Aryan");
		std2.setStdEmail("ar@gmail.com");
		
		std2.setCourses(Arrays.asList(
				courseRepo.findByCourseId(101),
				courseRepo.findByCourseId(102),
				courseRepo.findByCourseId(104))
				);
		repo.save(std2);

	}

}
