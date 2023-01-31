/**
 * 
 */
package com.restaurantapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;
import com.restaurantapp.repository.IRestaurantRepository;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class RestaurantServiceImpl implements IRestaurantService {

	IRestaurantRepository restaurantRepository;
	
	
	/**
	 * @param restaurantRepository the restaurantRepository to set
	 */
	@Autowired
	public void setRestaurantRepository(IRestaurantRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
	}

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantRepository.save(restaurant);
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		restaurantRepository.save(restaurant);
		
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		// TODO Auto-generated method stub
		restaurantRepository.deleteById(restaurantId);
		
	}

	@Override
	public List<Restaurant> getAll() {
		// TODO Auto-generated method stub
		return restaurantRepository.findAll();
	}

	@Override
	public Restaurant getById(int restaurantId) {
		// TODO Auto-generated method stub
		return restaurantRepository.findById(restaurantId).get();
	}

	@Override
	public List<Restaurant> getByCity(String city) {
		// TODO Auto-generated method stub
		return restaurantRepository.getByCity(city);
	}

	@Override
	public List<Restaurant> getByType(Type type) {
		// TODO Auto-generated method stub
		return restaurantRepository.getByType(type);
	}

	@Override
	public List<Restaurant> getByRating(double rating) {
		// TODO Auto-generated method stub
		return restaurantRepository.getByRating(rating);
	}

	@Override
	public List<Restaurant> getByItemName(String itemName) {
		// TODO Auto-generated method stub
		return restaurantRepository.getByItemName(itemName);
	}

	@Override
	public List<Restaurant> getByItemNameCategory(String itemName, String category) {
		// TODO Auto-generated method stub
		return restaurantRepository.getByItemNameCategory(itemName, category);
	}

	@Override
	public List<Restaurant> getByCusine(String cusine) {
		// TODO Auto-generated method stub
		return restaurantRepository.getByCusine(cusine);
		
	}

	@Override
	public List<Restaurant> getByCategory(String category) {
		// TODO Auto-generated method stub
		return restaurantRepository.getByCategory(category);
	}

	@Override
	public List<Restaurant> getByCusineAndType(String cusine, Type type) {
		// TODO Auto-generated method stub
		return restaurantRepository.getByCusineAndType(cusine, type);
	}

	@Override
	public List<Restaurant> getByItemNameLessPrice(String itemName, double price) {
		// TODO Auto-generated method stub
		return restaurantRepository.getByItemNameLessPrice(itemName, price);
	}

}
