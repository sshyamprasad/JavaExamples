package com.sham.threads;

import com.shyam.collections.Employee;

public class TaskThread extends Thread {
	
	private Employee emp;

	public TaskThread(Employee emp) {
		super();
		this.emp = emp;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Processing employee" + emp);
	}
	
	

}
