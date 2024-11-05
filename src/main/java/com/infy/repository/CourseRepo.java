package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {

}
