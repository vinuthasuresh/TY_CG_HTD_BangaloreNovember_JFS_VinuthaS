package com.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.jpawithhibernate.mapping.EmpInfo;

import lombok.Data;

@Data
@Entity
@Table(name="tr_info")
public class Training_info {
	
	
	@Id
	@Column
	private int tid;
	
	@Column
	private String tname;
	@Column 
	private int duration;
	
	
	@ManyToMany(cascade =CascadeType.ALL)
	@JoinTable(name="training_emp",
			joinColumns=@JoinColumn(name="tid"),
			inverseJoinColumns=@JoinColumn(name="empid"))
	        private List<EmpInfo> emp;

}
