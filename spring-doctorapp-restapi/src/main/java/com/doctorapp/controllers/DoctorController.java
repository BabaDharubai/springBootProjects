/**
 * 
 */
package com.doctorapp.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;

/**
 * @author BabaFakruddinDharuba
 *
 */
@RestController
public class DoctorController {

	private IDoctorService doctorService;
	
	
	/**
	 * @param doctorService the doctorService to set
	 */
	@Autowired
	public void setDoctorService(IDoctorService doctorService) {
		this.doctorService = doctorService;
	}


	@GetMapping("/doctors")
	public List<Doctor> getAll(){
		
		return doctorService.getAll();
	}
	
	@GetMapping("doctors/names")
	public List<String> getAllNames(){
		
		return doctorService.getAllNames();
	}
	
	@GetMapping("doctors/speciality/{speciality}")
	public List<Doctor> getBySpeciality(@PathVariable("speciality") String speciality){
		
		return doctorService.getBySpeciality(speciality);
	}
	
	@GetMapping("doctors/total-salary")
	public double getTotalSalary(){
		
		return doctorService.getTotalSalary();
	}
	
	@GetMapping("doctors/avg-age")
	public double getAvgAge(){
		
		return doctorService.getAvgAge();
	}
}
