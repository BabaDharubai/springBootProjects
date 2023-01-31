package com.restaurantapp.service;

import java.util.List;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Item;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;

public interface IItemService {
	
	//inbuild
	void addItem(Item item);
	void updateItem(Restaurant restaurant,Item item);
	void deleteItem(int itemId);
	Item getById(int itemId);
	
	
	List<Item> getByRestaurant(String restuarantName);
	List<Item> getByCategory(Category category);
	List<Item> getByRestaurantCategory(String restaurantname,Category category);
	
	
	List<Item> getByRestaurantItemType(String restaurantname,Type Itemtype);
	List<Item> getByCuisineAndCity(String cuisine,String city);
	List<Item> getByItemNameRating(String itemName,double rating);
}
