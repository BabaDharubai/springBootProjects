/**
 * 
 */
package com.restaurantapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Item;
import com.restaurantapp.model.Type;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Repository
public interface IItemRepository extends JpaRepository<Item, Integer> {

//	void updateItem(Restaurant restaurant,Item item);
//	void deleteItem(int itemId);
	Item getById(int itemId);
	
	
	List<Item> findByRestaurantName(String restuarantName);
	List<Item> findByCategory(Category category);
	
	@Query("from Item i inner join i.restaurant r where r.name=?1 and i.category=?2")
	List<Item> findByRestaurantCategory(String restaurantname,Category category);
	
	@Query("from Item i inner join i.restaurant r where r.name=?1 and i.itemType=?2")
	List<Item> findByRestaurantItemType(String restaurantname,Type Itemtype);
	@Query("from Item i inner join i.restaurant r where i.cusine=?1 and r.city=?2")
	List<Item> findByCuisineAndCity(String cuisine,String city);
	@Query("from Item i inner join i.restaurant r where i.itemName=?1 and r.rating>=?2")
	List<Item> findByItemNameRating(String itemName,double rating);
}
