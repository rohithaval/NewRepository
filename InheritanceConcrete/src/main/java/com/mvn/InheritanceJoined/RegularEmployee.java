package com.mvn.InheritanceJoined;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@AttributeOverrides({
	@AttributeOverride(name="empId", column = @Column(name="EMPID")),
	@AttributeOverride(name="name",column=@Column(name="EMPNAME"))
})
public class RegularEmployee extends Employee{
	
	@Column
	long salary;

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
 
	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + "]";
	}

	
	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RegularEmployee(long salary) {
		super();
		this.salary= salary;
		// TODO Auto-generated constructor stub
	}
	
}
