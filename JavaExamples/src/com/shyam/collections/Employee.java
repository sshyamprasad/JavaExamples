package com.shyam.collections;

public class Employee {

	int empID;
	String empName;
	Department department;

	public Employee(int empID, String empName, Department department) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.department = department;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", department=" + department + "]";
	}

	
}
