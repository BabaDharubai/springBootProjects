/**
 * 
 */
package com.restaurantapp.service;

import java.util.List;

import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;

/**
 * @author BabaFakruddinDharuba
 *
 */
public interface IRestaurantService {
	
	Restaurant addRestaurant(Restaurant restaurant);
	void updateRestaurant(Restaurant restaurant);
	void deleteRestaurant(int restaurantId);
	List<Restaurant> getAll();
	Restaurant getById(int restaurantId);
	
	
	//derived
	List<Restaurant> getByCity(String city);
	List<Restaurant> getByType(Type type);
	List<Restaurant> getByRating(double rating);
	
	//custom queries
	List<Restaurant> getByItemName(String itemName);
	List<Restaurant> getByItemNameCategory(String itemName,String category);
	List<Restaurant> getByCusine(String cusine);
	List<Restaurant> getByCategory(String category);
	List<Restaurant> getByCusineAndType(String cusine,Type type);
	List<Restaurant> getByItemNameLessPrice(String itemName,double price);
}
