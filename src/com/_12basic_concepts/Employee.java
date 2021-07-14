package com._12basic_concepts;

public class Employee {

	int empId;
	String empName;
	double salary;
	int grade;
	String company = "Ericsson";
	Email email;
	
	
	public Employee(int empId, String empName, Email email) {
		this.empId = empId;
		this.empName = empName;
		this.email = email;
	}
	
	public void notifyEmail() {
		email.sendEmail();
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
