package com.irc.jee.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_e_employee_emp database table.
 * 
 */
@Entity
@Table(name="t_e_employee_emp")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EMP_ID")
	private int empId;

	@Column(name="DRT_ID")
	private String drtId;

	@Column(name="EMP_AGE")
	private int empAge;

	@Column(name="EMP_EMAIL")
	private String empEmail;

	@Column(name="EMP_FIRSTNAME")
	private String empFirstname;

	@Column(name="EMP_LASTNAME")
	private String empLastname;

	public Employee() {
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDrtId() {
		return this.drtId;
	}

	public void setDrtId(String drtId) {
		this.drtId = drtId;
	}

	public int getEmpAge() {
		return this.empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpEmail() {
		return this.empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpFirstname() {
		return this.empFirstname;
	}

	public void setEmpFirstname(String empFirstname) {
		this.empFirstname = empFirstname;
	}

	public String getEmpLastname() {
		return this.empLastname;
	}

	public void setEmpLastname(String empLastname) {
		this.empLastname = empLastname;
	}

}