package com.infy.repotest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.entity.Gaurdian;
import com.infy.entity.Student;

import com.infy.repository.StudentRepo;

@SpringBootTest
public class StudentRepoTest {

	@Autowired
	private StudentRepo studentRepo;

	/*
	 * @Test public void saveStudent() { Student student=Student.builder()
	 * .emailId("nagarajumadishetti@gmail.com") .fisrtName("shivaji")
	 * .lastName("Dasari") //.guardianName("chiru")
	 * //.guardianEmail("shiva@gmail.com1") //.guardianMobile("9987648755")
	 * .build();
	 * 
	 * studentRepo.save(student);
	 * 
	 * }
	 */
	@Test
	public void saveGaurdianWithStudent() {
		Gaurdian gaurdian=Gaurdian.builder()
				.email("Naga@gmail.com")
				.name("Nagaraju")
				.mobile("9121944899")
				.build();
		
		
		Student student=Student.builder()
				.emailId("mahi2@gmail.com")
				.fisrtName("mahesh")
				.lastName("siripuram")
				.gaurdian(gaurdian)
				.build();
		studentRepo.save(student);
	}
	
	  @Test public void printAllStudents() { 
		  List<Student> student=studentRepo.findAll();
	  System.out.println("List of Students :"+student);
	  
	  }
	  @Test
	  public void getStudentByFirstName() {
		  Student student=studentRepo.findByFisrtName("arun"); 
		  System.out.println("Finding By FirstName"+ student);
	  }
	 
}
