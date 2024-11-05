package com.infy.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {
	@Id
	@SequenceGenerator(name="courese_marerial_seq",sequenceName = "courese_marerial_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long courseMaterialId;
	private String url;
	
@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
@JoinColumn(name = "course_Id",referencedColumnName = "courseId")
	private Course course;

}
