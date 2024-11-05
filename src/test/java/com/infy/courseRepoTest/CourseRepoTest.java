package com.infy.courseRepoTest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.entity.Course;
import com.infy.entity.Teacher;
import com.infy.repository.CourseRepo;

@SpringBootTest
public class CourseRepoTest {
	@Autowired
	private CourseRepo courseRepo;
	
//	
	
	  @Test 
	  public void addCouseWithTeacher() {
	Teacher teacher=Teacher.builder()
	  .firstName("Vijay") 
	  .lastName("Naradasu") 
	  .build(); 
	  
	Course  course=Course.builder() 
	  .tittle("python") 
	  .credit(7) 
	  .teacher(teacher)
	  .build(); 
	  courseRepo.save(course); 
	  }
	  
	  @Test
	public void findAllCourses() {
		List<Course> course=courseRepo.findAll();
			System.out.println("courses"+course);
	}
	 

}
