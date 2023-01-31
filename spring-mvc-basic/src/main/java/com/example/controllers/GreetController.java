/**
 * 
 */
package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Controller
public class GreetController {
	
	@RequestMapping("greet")
	public String greetUser(Model model) {
		//create a model object
		String message="Have a great day";
		//attach data to model
		//first arg is dummy name
		//second arg is the original data
		model.addAttribute("message",message);
		//return the name that points to jsp
		//here succes is the jsp page name
		return "success";
	}
	@RequestMapping("/hello")
	public String sayHello(ModelMap map) {
		map.addAttribute("message","Hello! How are You");
		return "success";
	}
	
	@RequestMapping("welcome")
	public ModelAndView welcomeUser() {
		//ModelView is a class
		//create a model and send to a view
		ModelAndView modelview=new ModelAndView("success", "message", "Welcome to mvc");
		return modelview;
	}
}
