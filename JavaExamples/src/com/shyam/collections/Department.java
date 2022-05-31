package com.shyam.collections;

public class Department {
	
	int depID;
	String depName;
	
	public Department(int depID, String depName) {
		super();
		this.depID = depID;
		this.depName = depName;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public int getDepID() {
		return depID;
	}

	public void setDepID(int depID) {
		this.depID = depID;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	public String toString() {
		return  depName ;
	}
	
	

}
