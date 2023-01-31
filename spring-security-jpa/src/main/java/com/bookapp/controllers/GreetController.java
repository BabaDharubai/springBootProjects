/**
 * 
 */
package com.bookapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BabaFakruddinDharuba
 *
 */
@RestController
public class GreetController {

	@GetMapping("/greet")
	public String greet() {
		return "Greet day";
	}
	
	@GetMapping("/")
	public String home() {
		return "Online Shopping";
	}
	
	@GetMapping("/admin/add")
	public String addBook() {
		return "book added";
	}
	
	@GetMapping("/admin/update")
	public String updateBook() {
		return "book updated";
	}
	
	@GetMapping("/books/show")
	public List<String > showBooks() {
		return Arrays.asList("Secret","5am club","Leadership");
	}
}
