package com.integration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author Fredy Vazquez
 * @FechaCreacion 14/11/2018
 *
 */
@Entity(name = "employee")
@Table(name = "employee")//, schema = "Oracle")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long empId;
	private String empName;
	private String empAlias;
	private String empPassword;
	private String empDni;
	private String empEmail;

	public Employee() {

	}

	// Getters
	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
	@SequenceGenerator(name = "sequence", sequenceName = "EMP_SEQ")
	public Long getEmpId() {
		return empId;
	}

	@Column(name = "emp_name")
	public String getEmpName() {
		return empName;
	}

	@Column(name = "emp_alias")
	public String getEmpAlias() {
		return empAlias;
	}

	@Column(name = "emp_password")
	public String getEmpPassword() {
		return empPassword;
	}

	@Column(name = "emp_dni")
	public String getEmpDni() {
		return empDni;
	}

	@Column(name = "emp_email")
	public String getEmpEmail() {
		return empEmail;
	}

	// SETTERS
	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpAlias(String empAlias) {
		this.empAlias = empAlias;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public void setEmpDni(String empDni) {
		this.empDni = empDni;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAlias=" + empAlias + ", empPassword="
				+ empPassword + ", empNi=" + empDni + ", empEmail=" + empEmail + "]";
	}

}
