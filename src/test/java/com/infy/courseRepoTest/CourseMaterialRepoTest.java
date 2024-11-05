package com.infy.courseRepoTest;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.entity.Course;
import com.infy.entity.CourseMaterial;
import com.infy.repository.CourseMaterialRepo;

@SpringBootTest
public class CourseMaterialRepoTest {
	@Autowired
	private CourseMaterialRepo courseMaterialRepo;
    @Test
	public void saveCourseMaterial() {
    	
    	Course course=Course.builder()
    			.tittle("java")
    			.credit(6)
    			.build();
	
    	CourseMaterial courseMaterial=CourseMaterial.builder()
    			.url("www.google.com")
    			.course(course)
    	        .build();
    	   
    	courseMaterialRepo.save(courseMaterial);
		
	}
    @Test
    public void findAllCourseMaterial() {
    	List<CourseMaterial> courseMaterials=courseMaterialRepo.findAll();
    System.out.println("courseMaterials :"+courseMaterials);
    	
    }
}
