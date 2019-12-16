package com.jpawithhibernate.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_info")
public class EmpInfo {
	@Id
	
	@Column
	private int empid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private String password;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy="ep")
	private EmpOthersInfo other;
	public EmpOthersInfo getOther() {
		return other;
	}
	public void setOther(EmpOthersInfo other) {
		this.other = other;
	}
	
	
	
	

}
