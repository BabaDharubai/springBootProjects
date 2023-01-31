/**
 * 
 */
package com.doctorapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Controller
public class AdminController {
	@RequestMapping("admin")
	public String admin() {
		return "admin";

	}
	
	@RequestMapping("add-doctor-form")
	public String addDoctor() {
		return "addDoctorForm";
	}
	
	@RequestMapping("update-doctor-form")
	public String showEditForm() {
		return "editDoctorForm";
	}
}
