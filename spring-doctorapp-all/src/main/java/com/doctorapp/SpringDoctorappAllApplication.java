package com.doctorapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.model.Address;
import com.doctorapp.model.Casesheet;
import com.doctorapp.model.Doctor;
import com.doctorapp.model.Hospital;
import com.doctorapp.model.Specialisation;
import com.doctorapp.model.Speciality;
import com.doctorapp.service.IDoctorService;
import com.doctorapp.service.IHospitalService;
import com.doctorapp.service.ISpecialityService;

@SpringBootApplication
public class SpringDoctorappAllApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappAllApplication.class, args);
	}
	
	IDoctorService doctorService;
	

	/**
	 * @param doctorService the doctorService to set
	 */
	@Autowired
	public void setDoctorService(IDoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
	IHospitalService hospitalService;



	/**
	 * @param hospitalService the hospitalService to set
	 */
	@Autowired
	public void setHospitalService(IHospitalService hospitalService) {
		this.hospitalService = hospitalService;
	}
	
	ISpecialityService specialityService;
	



	/**
	 * @param specialityService the specialityService to set
	 */
	@Autowired
	public void setSpecialityService(ISpecialityService specialityService) {
		this.specialityService = specialityService;
	}




	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Address address=new Address("RajajiNagar","Banglore","Karnataka");
//		
//		Speciality speciality=new Speciality(Specialisation.PHYSICIAN.getSpeciality());
//		Speciality speciality2=new Speciality(Specialisation.INTERNAL.getSpeciality());
//		Set<Speciality> specialities=new HashSet<>(Arrays.asList(speciality,speciality2));
//		
//		Hospital hospital=new Hospital("Malar Hospital","Banglore");
//		
//		Casesheet casesheet=new Casesheet("fever and cough");
//		Casesheet casesheet2=new Casesheet("vomiting and cold");
//		Set<Casesheet> casesheets=new HashSet<>(Arrays.asList(casesheet,casesheet2));
//		
//		Doctor doctor=new Doctor("Baba","baba@gmail.com",500,5,address);
//		doctor.setSpeciality(specialities);
//		doctor.setCasesheet(casesheets);
//		doctor.setHospital(hospital);
//		doctorService.addDoctor(doctor);
		
//		Hospital hospital=new Hospital("Yashoda Hospital","Hyderabad");
//		hospitalService.addHospital(hospital);
//		
//		Speciality speciality=new Speciality(Specialisation.DERMA.getSpeciality());
//		specialityService.addSpeciality(speciality);
//		Speciality speciality2=new Speciality(Specialisation.CARDIO.getSpeciality());
//		specialityService.addSpeciality(speciality2);
		
		
//		Address address=new Address("Jubilehills","Hyderabad","Telangana");
//		Doctor doctor=new Doctor("Harish","harish@gmail.com",1000,3,address);
//		Hospital hospital=hospitalService.getById(52);
//		hospital.setDoctors(new HashSet<>(Arrays.asList(doctor)));
//		Speciality speciality=specialityService.getById(4);
//		Speciality speciality2=specialityService.getById(2);
//		Set<Speciality> specialities=new HashSet<>(Arrays.asList(speciality,speciality2));
//		
//		Casesheet casesheet=new Casesheet("tooth ache");
//		Casesheet casesheet2=new Casesheet("root canal surgery");
//		Set<Casesheet> casesheets=new HashSet<>(Arrays.asList(casesheet,casesheet2));
//		
//		doctor.setHospital(hospital);
//		doctor.setSpeciality(specialities);
//		doctor.setCasesheet(casesheets);
//		doctorService.addDoctor(doctor);
		
		
		
	}

}
