/**
 * 
 */
package com.restaurantapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Item;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;
import com.restaurantapp.repository.IItemRepository;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class ItemServiceImpl implements IItemService{

	
	IItemRepository itemRepository;
	/**
	 * @param itemRepository the itemRepository to set
	 */
	@Autowired
	public void setItemRepository(IItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public void addItem( Item item) {
		// TODO Auto-generated method stub
		itemRepository.save(item);
		
	}

	@Override
	public void updateItem(Restaurant restaurant, Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(int itemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Item getById(int itemId) {
		// TODO Auto-generated method stub
		return itemRepository.getById(itemId);
	}

	@Override
	public List<Item> getByRestaurant(String restuarantName) {
		// TODO Auto-generated method stub
		return itemRepository.findByRestaurantName(restuarantName);
	}

	@Override
	public List<Item> getByCategory(Category category) {
		// TODO Auto-generated method stub
		return itemRepository.findByCategory(category);
	}

	@Override
	public List<Item> getByRestaurantCategory(String restaurantname, Category category) {
		// TODO Auto-generated method stub
		return itemRepository.findByRestaurantCategory(restaurantname, category);
	}

	@Override
	public List<Item> getByRestaurantItemType(String restaurantname, Type Itemtype) {
		// TODO Auto-generated method stub
		return itemRepository.findByRestaurantItemType(restaurantname, Itemtype);
	}

	@Override
	public List<Item> getByCuisineAndCity(String cuisine, String city) {
		// TODO Auto-generated method stub
		return itemRepository.findByCuisineAndCity(cuisine, city);
	}

	@Override
	public List<Item> getByItemNameRating(String itemName, double rating) {
		// TODO Auto-generated method stub
		return itemRepository.findByItemNameRating(itemName, rating);
	}

}
