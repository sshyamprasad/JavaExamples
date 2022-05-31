package com.sham.threads;

import java.util.ArrayList;
import java.util.List;

import com.shyam.collections.Department;
import com.shyam.collections.Employee;

public class MainThread {

	public static void main(String[] args) {
		
		List<Employee> empList = getEmpList();
		

		
		runTaskSequence(empList);
		runTaskConcurrently(empList);
		

	}

	private static void runTaskSequence(List<Employee> empList) {
		long time = System.currentTimeMillis();
		for (Employee employee : empList) {
			TaskThread task = new TaskThread(employee);
			task.run();//calling run method will not create Thread, it just act like normal function call
		}
		System.out.println("Time taken in sequence is " + (System.currentTimeMillis()-time));
	}

	private static void runTaskConcurrently(List<Employee> empList) {
		long time = System.currentTimeMillis();
		List<TaskThread> threadList = new ArrayList<TaskThread>();
		for (Employee employee : empList) {
			TaskThread taskThread = new TaskThread(employee);
			taskThread.start();
			threadList.add(taskThread);
		}
		
		for (TaskThread taskThread : threadList) {
			try {
				taskThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Time taken in concurrent is " + (System.currentTimeMillis()-time));
	}

	private static List getEmpList() {
		List<Employee> empList = new ArrayList<>();
		for(int i=0; i<1000; i++) {
			empList.add(new Employee(i,"Name"+i,new Department(10, "IT")));
		}
		return empList;
	}

}
