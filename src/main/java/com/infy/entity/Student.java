package com.infy.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(name="email_unique",columnNames = "emailId"))
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Student {
	@Id
	@SequenceGenerator(name="student_Sequence",sequenceName = "student_Sequence",allocationSize =1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_Sequence")
	private Long studentId;
	private String fisrtName;
	private String lastName;
	private String emailId;
//	@Column(name="gaurdian_name")
//	private String guardianName;
//	@Column(name="gaurdian_email")
//	private String guardianEmail;
//	@Column(name="gaurdian_mobile")
//	private String guardianMobile;

	@Embedded
	private Gaurdian gaurdian;

}
