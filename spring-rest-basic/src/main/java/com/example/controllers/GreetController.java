/**
 * 
 */
package com.example.controllers;

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
		return "hello!!! how are you?";
	}
	
	@GetMapping("/show-books")
	public List<String> show() {
		return Arrays.asList("Secret","5amclub","Alchemist");
	}
}
