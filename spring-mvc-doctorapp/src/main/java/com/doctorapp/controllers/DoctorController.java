/**
 * 
 */
package com.doctorapp.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;

/**
 * @author BabaFakruddinDharubai
 *
 */
@Controller
public class DoctorController {
	
	private IDoctorService doctorService;
	/**
	 * @param doctorService
	 */
	public DoctorController(IDoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}
	
	@RequestMapping("/")
	public String getAll(Model model) {
		List<Doctor> doctors=doctorService.getAllDoctors();
		model.addAttribute("doctors",doctors);
		return "home";
	}
	
	@RequestMapping("add-doctor")
	public String addDoctor(Doctor doctor,Model model) {
		doctorService.addDoctor(doctor);
		model.addAttribute("message","Doctor is added");
		return "admin";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("speciality")String speciality,Model model) {
		List<Doctor> doctors=doctorService.getBySpeciality(speciality);
		model.addAttribute("doctors", doctors);
		return "home";
	}
	
	@RequestMapping("get-by-id")
	public String getById(@RequestParam("id")Integer doctorId,Model model) {
		Doctor doctor=doctorService.getById(doctorId);
		model.addAttribute("doctor",doctor);
		return "updateDoctorForm";
	}
	
	@RequestMapping("update-fees")
	public String updateDoctor(
			@RequestParam("id")Integer doctorId,
			@RequestParam("fees")double fees,
			Model model) {
		doctorService.updateDoctor(doctorId, fees);
		model.addAttribute("message","Doctor fee is updated");
		return "admin";
	}
	
	@ExceptionHandler(DoctorNotFoundException.class)
	public String handleDoctorException(Model model,Exception e) {
		model.addAttribute("message",e.getMessage());
		return "redirect:/";
	}
	
	
	
//	@RequestMapping("add-doctor")
//	public String addDoctor(
//		@RequestParam("doctorName")String doctorName,
//		@RequestParam("doctorId")Integer doctorId,
//		@RequestParam("experience")int experience,
//		@RequestParam("fees")double fees,
//		@RequestParam("speciality")String speciality,
//		@RequestParam("startTime")
//		@DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME)LocalDateTime  startTime,
//		@RequestParam("endTime")
//		@DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME)LocalDateTime endTime,Model model) {
//		
//		Doctor doctor=new Doctor();
//		doctor.setDoctorName(doctorName);
//		doctor.setDoctorId(doctorId);
//		doctor.setExperience(experience);
//		doctor.setFees(fees);
//		doctor.setSpeciality(speciality);
//		doctor.setStartTime(startTime);
//		doctor.setEndTime(endTime);
//		
//		model.addAttribute("doctor",doctor);
//		return "success";
//	}
	
}
