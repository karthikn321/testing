package org.practice;

public class EmployeeInfo extends Employee{
	private void empAddress() {
		System.out.println("Chennai");
	}
	public static void main(String[] args) {
		EmployeeInfo employeeInfo=new EmployeeInfo();
		employeeInfo.empName();
		employeeInfo.empId();
		//employeeInfo.empAge();
		employeeInfo.empAddress();
	}
	
}
		
	
