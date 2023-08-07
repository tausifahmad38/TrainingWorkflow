package com.hcl.elch.freshersuperchargers.trainingworkflow.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employee_details")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	@Id
	private String email;

	private Long sapId;

	private String name;

	private String contactNo;

	private String alternateContactNo;

	private String address;

	@OneToOne
	private Gender gender;

	@OneToOne
	private State state;

	@OneToOne
	private Region region;

	private String sheetCode;

	private Boolean ProjAssignedStatus;

	@OneToOne
	private Category category;

}
