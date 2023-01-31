/**
 * 
 */
package com.bookapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bookapp.model.AppUser;
import com.bookapp.service.UserDetailsServiceImpl;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Controller
public class UserController {
	
	private PasswordEncoder encoder;
	
	/**
	 * @param encoder the encoder to set
	 */
	@Autowired
	public void setEncoder(PasswordEncoder encoder) {
		this.encoder = encoder;
	}
	
	
	private UserDetailsServiceImpl userDetailsService;

	/**
	 * @param userDetailsService the userDetailsService to set
	 */
	@Autowired
	public void setUserDetailsService(UserDetailsServiceImpl userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	@PostMapping("/users")
	public String addUser(@RequestBody AppUser user) {
		String password=encoder.encode(user.getPassword());
		user.setPassword(password);
		userDetailsService.addUser(user);
		return "Added";
	}
}
