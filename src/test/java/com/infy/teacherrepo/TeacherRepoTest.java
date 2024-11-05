package com.infy.teacherrepo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.entity.Course;
import com.infy.entity.Teacher;
import com.infy.repository.TeacherRepo;

@SpringBootTest
public class TeacherRepoTest {
	@Autowired
	private TeacherRepo teacherRepo;
	@Test
	public void saveTeacher() {
		Course course=Course.builder()
				.tittle(".Net")
				.credit(5)
				.build();
		
	
		
		Teacher teacher=Teacher.builder()
				.firstName("Anitha")
				.lastName("adupa")
				.course(List.of(course))
				.build();
		teacherRepo.save(teacher);
		}

}
