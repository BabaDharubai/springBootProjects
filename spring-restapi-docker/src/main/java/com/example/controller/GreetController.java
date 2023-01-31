/**
 * 
 */
package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BabaFakruddinDharuba
 *
 */
@RestController
public class GreetController {
	
	@GetMapping("greet")
	public String greet() {
		return "Hi Baba";
	}

}
