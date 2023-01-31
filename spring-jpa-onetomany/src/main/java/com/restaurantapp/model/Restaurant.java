/**
 * 
 */
package com.restaurantapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Entity
public class Restaurant {
	@Id
	@GeneratedValue(generator="restaurant_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="restaurant-gen",sequenceName = "restaurant_sequence",initialValue = 100,allocationSize = 1)
	private Integer restaurantId;
	
	@Column(length = 20)
	private String name;
	
	@Column(length=20)
	private String city;
	
	@Enumerated(value=EnumType.STRING)
	private Type type;
	
	private double rating;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="resta_id")
	private Set<Item> items;
	/**
	 * 
	 */
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param city
	 * @param type
	 * @param rating
	 * @param items
	 */
	public Restaurant(String name, String city, Type type, double rating, Set<Item> items) {
		super();
		this.name = name;
		this.city = city;
		this.type = type;
		this.rating = rating;
		this.items = items;
	}
	/**
	 * @return the restaurantId
	 */
	public Integer getRestaurantId() {
		return restaurantId;
	}
	/**
	 * @param restaurantId the restaurantId to set
	 */
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
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
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	/**
	 * @return the items
	 */
	public Set<Item> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", city=" + city + ", type=" + type
				+ ", rating=" + rating + ", items=" + items + "]";
	}
	
	
	

}
