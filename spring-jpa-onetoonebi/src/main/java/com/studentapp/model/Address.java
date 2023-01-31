/**
 * 
 */
package com.studentapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Entity
@Table(name="biaddress")
public class Address {
	@Id
	@GeneratedValue(generator = "biaddress_gen",strategy =GenerationType.AUTO )
	@SequenceGenerator(name = "biaddress_gen",sequenceName = "biaddress_seq",initialValue = 1,allocationSize = 1)
	private Integer addressId;
	
	@Column(length=20)
	private String flatno;
	
	@Column(length=20)
	private String streetname;
	
	@Column(length=20)
	private String city;
	
	@Column(length = 20)
	private String state;
	@OneToOne(mappedBy = "address")
	Student student;
	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param addressId
	 * @param flatno
	 * @param streetname
	 * @param city
	 * @param state
	 */
	public Address( String flatno, String streetname, String city, String state) {
		super();
		this.flatno = flatno;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
	}
	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	/**
	 * @return the flatno
	 */
	public String getFlatno() {
		return flatno;
	}
	/**
	 * @param flatno the flatno to set
	 */
	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
	/**
	 * @return the streetname
	 */
	public String getStreetname() {
		return streetname;
	}
	/**
	 * @param streetname the streetname to set
	 */
	public void setStreetname(String streetname) {
		this.streetname = streetname;
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", flatno=" + flatno + ", streetname=" + streetname + ", city="
				+ city + ", state=" + state + "]";
	}
	
}
