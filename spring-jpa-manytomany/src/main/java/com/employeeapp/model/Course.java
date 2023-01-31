/**
 * 
 */
package com.employeeapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

/**
 * @author BabaFakruddinDharubai
 *
 */
@Entity
public class Course {
	@Id
	@GeneratedValue(generator = "course_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "corse_gen",sequenceName = "course_sequence",initialValue = 1,allocationSize = 1)
	private Integer courseId;
	@Column(length = 20,name = "coursename")
	private String courseName;
	@Column(length=20)
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(length=20)
	@Enumerated(EnumType.STRING)
	private Mode mode;
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@ManyToMany(mappedBy = "courses")
	private Set<Employee> employees;
	/**
	 * 
	 */
	public Course() {
		super();
	}
	/**
	 * @param courseName
	 * @param category
	 * @param mode
	 */
	public Course(String courseName, Category category, Mode mode) {
		super();
		this.courseName = courseName;
		this.category = category;
		this.mode = mode;
	}
	/**
	 * @return the courseId
	 */
	public Integer getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	/**
	 * @return the mode
	 */
	public Mode getMode() {
		return mode;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(Mode mode) {
		this.mode = mode;
	}
	/**
	 * @return the employees
	 */
	public Set<Employee> getEmployees() {
		return employees;
	}
	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", category=" + category + ", mode="
				+ mode + "]";
	}
	
}
