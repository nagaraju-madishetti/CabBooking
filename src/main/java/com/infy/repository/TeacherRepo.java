package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Long> {

}
