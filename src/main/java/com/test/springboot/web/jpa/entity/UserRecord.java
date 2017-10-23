package com.test.springboot.web.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class UserRecord {
	
	@Id
	private int emp_id;
	private String name;
	private String role;
	private double wage;
	private String emp_group;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public String getEmp_group() {
		return emp_group;
	}
	public void setEmp_group(String emp_group) {
		this.emp_group = emp_group;
	}
}
