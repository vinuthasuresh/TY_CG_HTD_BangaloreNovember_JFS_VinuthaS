package com.jpawithhibernate.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_others_info")
public class EmpOthersInfo {
	@Id
	@Column
	private int id;
	@Column 
	private String passport;
	@Column
	private String fathername;
	@Column
	private String mothername;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	
	
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmpInfo ep;
	public EmpInfo getEp() {
		return ep;
	}
	public void setEp(EmpInfo ep) {
		this.ep = ep;
	}
	
	}
	
	
	
	
	
	


