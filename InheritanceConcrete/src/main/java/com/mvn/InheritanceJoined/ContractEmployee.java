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
public class ContractEmployee extends Employee{
	
	@Column
	int days;

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "ContractEmployee [days=" + days + "]";
	}

	public ContractEmployee(int days) {
		super();
		this.days = days;
	}

	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
