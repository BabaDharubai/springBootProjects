/**
 * 
 */
package com.studentapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Entity
public class Address {
	@Id
	@GeneratedValue(generator = "address_gen",strategy =GenerationType.AUTO )
	@SequenceGenerator(name = "address_gen",sequenceName = "address_seq",initialValue = 1,allocationSize = 1)
	private Integer addressId;
	@Column(length=20)
	private String city;
	@Column(length = 20)
	private String state;
	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param city
	 * @param state
	 */
	public Address(String city, String state) {
		super();
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
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + "]";
	}
	
}
