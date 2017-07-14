package com.mvn.InheritanceJoined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Concrete")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Employee {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.TABLE)
	int empId;
	
	@Column(name="Emp_NAME")
	String name;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
