package com.infy.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
	@Id
	@SequenceGenerator(name = "course_seq",sequenceName = "course_seq",allocationSize = 1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
private Long courseId;
private String tittle;
private Integer credit;
@OneToOne(mappedBy = "course")
private CourseMaterial courseMaterial;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="teacher_id",referencedColumnName = "teacherId")
private Teacher teacher;


}
