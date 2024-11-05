package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

	Student findByFisrtName(String firstName);

}
