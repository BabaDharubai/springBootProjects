/**
 * 
 */
package com.employeeapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

/**
 * @author BabaFakruddinDharubai
 *
 */
@Entity
public class Employee {
	@Id
	@GeneratedValue(generator = "employee_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "employee_gen",sequenceName = "employee_sequence",initialValue = 1,allocationSize = 1)
	private Integer employeeId;
	@Column(length = 20)
	private String name;
	@Column(length=20)
	private String department;
	@Column(length=20)
	private String city;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(
			name="employee_course",
			joinColumns = @JoinColumn(name="employee_id"),
					inverseJoinColumns = @JoinColumn(name="course_id")
	)
	private Set<Course> courses;
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param department
	 * @param city
	 * @param courses
	 */
	public Employee(String name, String department, String city, Set<Course> courses) {
		super();
		this.name = name;
		this.department = department;
		this.city = city;
		this.courses = courses;
	}
	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the courses
	 */
	public Set<Course> getCourses() {
		return courses;
	}
	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", department=" + department + ", city=" + city
				+ ", courses=" + courses + "]";
	}
	
	
	
}
