/**
 * 
 */
package com.studentapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Entity
@Table(name="bistudent")
public class Student {
	@Id
	@GeneratedValue(generator = "bistudent_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "bistudent_gen",sequenceName = "bistudent_seq",initialValue = 10,allocationSize = 1)
	private Integer studentId;
	
	@Column(length=20)
	private String name;
	@Column(length=20,nullable = false)
	private String department;
	@Column(length=50,unique = true)
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param name
	 * @param department
	 * @param email
	 * @param address
	 */
	public Student(String name, String department, String email, Address address) {
		super();
		this.name = name;
		this.department = department;
		this.email = email;
		this.address = address;
	}

	/**
	 * @return the studentId
	 */
	public Integer getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
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
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", department=" + department + ", email=" + email
				+ ", address=" + address + "]";
	}
	

}
