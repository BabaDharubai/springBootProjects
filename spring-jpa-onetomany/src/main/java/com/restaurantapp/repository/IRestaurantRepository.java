 
/**
 * 
 */
package com.restaurantapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Repository
public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer>{

		//derived
		List<Restaurant> getByCity(String city);
		List<Restaurant> getByType(Type type);
		List<Restaurant> getByRating(double rating);
		
		//custom queries
		@Query("from Restaurant r inner join r.items i where i.itemName=?1")
		List<Restaurant> getByItemName(String itemName);
		@Query("from Restaurant r inner join r.items i where i.itemName=?1 and i.category=?2")
		List<Restaurant> getByItemNameCategory(String itemName,String category);
		@Query("from Restaurant r inner join r.items i where i.cusine=?1")
		List<Restaurant> getByCusine(String cusine);
		
		
		@Query("from Restaurant r inner join r.items i where i.category=?1")
		List<Restaurant> getByCategory(String category);
		@Query("from Restaurant r inner join r.items i where i.cusine=?1 and i.itemType=?2")
		List<Restaurant> getByCusineAndType(String cusine,Type type);
		@Query("from Restaurant r inner join r.items i where i.itemName=?1 and i.price<=?2")
		List<Restaurant> getByItemNameLessPrice(String itemName,double price);
}
