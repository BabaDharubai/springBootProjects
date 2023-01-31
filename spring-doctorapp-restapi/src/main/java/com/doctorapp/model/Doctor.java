/**
 * 
 */
package com.doctorapp.model;

/**
 * @author BabaFakruddinDharuba
 *
 */
public class Doctor {
	
	private String name;
	private double salary;
	private String speciality;
	private int age;
	/**
	 * 
	 */
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param salary
	 * @param speciality
	 * @param age
	 */
	public Doctor(String name, double salary, String speciality, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.speciality = speciality;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}
	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", salary=" + salary + ", speciality=" + speciality + ", age=" + age + "]";
	}
	

}
