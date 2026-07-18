package com.MethodOverridingExamples;

	public class Manager extends Employee {

	    @Override
	    public void work() {
	        System.out.println("Manager is managing the team.");
	    }

	    public static void main(String[] args) {

	        Employee emp = new Employee();
	        emp.work();

	        Developer dev = new Developer();
	        dev.work();

	        Manager mgr = new Manager();
	        mgr.work();
	    }
	}


