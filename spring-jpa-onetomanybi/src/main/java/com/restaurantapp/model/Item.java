/**
 * 
 */
package com.restaurantapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Entity
@Table(name="biitem")
public class Item {
	@Id
	@GeneratedValue(generator="item_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="item_gen",sequenceName = "item_sequence",initialValue =1,allocationSize = 1)
	private Integer itemId;
	
	@Column(name="itemname",length=20)
	private String itemName;
	
	@Column(length=20)
	private String cusine;
	
	@Column(name="category",length=20)
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@Enumerated(EnumType.STRING)
	private Type itemType;
	
	private double price;
	@ManyToOne
	@JoinColumn(name="resta_id")
	private Restaurant restaurant;
	
	/**
	 * 
	 */
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param itemName
	 * @param cusine
	 * @param category
	 * @param itemType
	 * @param price
	 */
	public Item(String itemName, String cusine, Category category, Type itemType, double price) {
		super();
		this.itemName = itemName;
		this.cusine = cusine;
		this.category = category;
		this.itemType = itemType;
		this.price = price;
	}

	/**
	 * @return the itemId
	 */
	public Integer getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the cusine
	 */
	public String getCusine() {
		return cusine;
	}

	/**
	 * @param cusine the cusine to set
	 */
	public void setCusine(String cusine) {
		this.cusine = cusine;
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
	 * @return the itemType
	 */
	public Type getItemType() {
		return itemType;
	}

	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(Type itemType) {
		this.itemType = itemType;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the restaurant
	 */
	public Restaurant getRestaurant() {
		return restaurant;
	}

	/**
	 * @param restaurant the restaurant to set
	 */
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", cusine=" + cusine + ", category=" + category
				+ ", itemType=" + itemType + ", price=" + price + "]";
	}

}
