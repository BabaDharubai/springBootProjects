package com.training;


/**
 * @author BabaFakruddinDharuba
 *
 */


class Employee{
	private String name;
	private double salary;
	
	
	/**
	 * @param name
	 * @param salary
	 */
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	void printDetails() {
		System.out.println("Name" +name);
		System.out.println("Sal "+salary);
	}
	
	String greet(String msg) {
		return null;
	}
}
public class Trial {
	public static void main(String[] args) {
		Employee emp=new Employee("Jack",8000);
		emp.printDetails();
		System.out.println(emp.greet("Greet Day"));
	}

}
