package com.restaurantapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Cusine;
import com.restaurantapp.model.Item;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;
import com.restaurantapp.service.IRestaurantService;

@SpringBootApplication
public class SpringJpaOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOnetomanyApplication.class, args);
	}
	
	IRestaurantService restaurantService;
	

	/**
	 * @param restaurantService the restaurantService to set
	 */
	@Autowired
	public void setRestaurantService(IRestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Item item1=new Item("Biryani",Cusine.SOUTHINDIAN.name(),Category.MAINCOURSE,Type.NONVEG,300);
//		Item item2=new Item("Dosa",Cusine.NORTHINDIAN.name(),Category.BREAKFAST,Type.VEG,100);
//		Item item3=new Item("poori",Cusine.NORTHINDIAN.name(),Category.BREAKFAST,Type.VEG,150);
//		Set<Item> items=new HashSet<>(Arrays.asList(item1,item2,item3));
//		
//		Restaurant restaurant=new Restaurant("Baba","Proddatur",Type.NONVEG,4.5,items);
//		
//		restaurantService.addRestaurant(restaurant);
		Item item4=new Item("GobiManchurian",Cusine.CONTINENTAL.name(),Category.FASTFOOD,Type.VEG,120);
		Item item5=new Item("Noodles",Cusine.CONTINENTAL.name(),Category.FASTFOOD,Type.VEG,90);
		Item item6=new Item("EggNoodles",Cusine.CONTINENTAL.name(),Category.FASTFOOD,Type.NONVEG,180);
		Set<Item> items2=new HashSet<>(Arrays.asList(item4,item5,item6));
		
		Restaurant restaurant2=new Restaurant("Anand","Hyderabad",Type.VEGANDNONVEG,4.0,items2);
//		
//		restaurantService.addRestaurant(restaurant2);
		
		restaurantService.getAll().forEach(System.out::println);
		
		
		
//		Item item7=new Item("Idli",Cusine.SOUTHINDIAN.name(),Category.BREAKFAST,Type.VEG,60);
//		Item item8=new Item("Uthapam",Cusine.SOUTHINDIAN.name(),Category.BREAKFAST,Type.VEG,90);
//		Item item9=new Item("CocoCola",Cusine.NORTHINDIAN.name(),Category.BEVERAGES,Type.VEG,30);
//		Set<Item> items3=new HashSet<>(Arrays.asList(item7,item8,item9));
//		
//		Restaurant restaurant3=new Restaurant("Harish","Banglore",Type.VEG,3.5,items3);
//		restaurantService.addRestaurant(restaurant3);
//		
//		Restaurant restaurant4=restaurantService.getById(4);
//		restaurantService.updateRestaurant(restaurant4);
		restaurantService.getByCity("Proddatur").forEach(System.out::println);
		System.out.println();
		restaurantService.getByType(Type.NONVEG).forEach(System.out::println);
		System.out.println();
		restaurantService.getByRating(4.5).forEach(System.out::println);
		System.out.println();
		restaurantService.getByItemName("Idli").forEach(System.out::println);
		System.out.println();
		restaurantService.getByCusine(Cusine.ITALIAN.name()).forEach(System.out::println);
		System.out.println();
		restaurantService.getByCusineAndType(Cusine.NORTHINDIAN.name(), Type.VEG).forEach(System.out::println);
		System.out.println();
		restaurantService.getByItemNameLessPrice("Biryani", 350).forEach(System.out::println);
		System.out.println();
		//restaurantService.getByCategory(Category.FASTFOOD.name()).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
