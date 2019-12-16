package com.jpawithhibernate.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import com.jpawithhibernate.mapping.EmpInfo;

import lombok.Data;

@Data
@Entity
@Table(name="emp_exp")

public class EmpExpirence {
	@Id
	@Column
	private int expid;
	
	@Column
	private String company;
	@Column
	private int year;
	
	@ManyToOne(cascade=CascadeType.ALL )
	@JoinColumn(name="empid")
	private EmpInfo emp;

}
