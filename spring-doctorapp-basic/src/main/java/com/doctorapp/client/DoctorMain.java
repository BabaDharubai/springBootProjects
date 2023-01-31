/**
 * 
 */
package com.doctorapp.client;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.doctorapp.model.Specialization;
import com.doctorapp.service.IDoctorService;

/**
 * @author BabaFakruddinDharubai
 *
 */
public class DoctorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new AnnotationConfigApplicationContext("com.doctorapp");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println();
		IDoctorService doctorService=context.getBean(IDoctorService.class);
		System.out.println();
		doctorService.getAllDoctors().forEach(System.out::println);
		System.out.println();
		System.out.println( doctorService.getById(3));
		System.out.println();
		doctorService.getBySpeciality(Specialization.CARDIO.type).forEach(System.out::println);
		System.out.println();
		doctorService.getBySpecialityAndFees(Specialization.CARDIO.type, 1500).forEach(System.out::println);
		System.out.println();
		doctorService.getBySpecialityName(Specialization.CARDIO.type, "s").forEach(System.out::println);
	}

}
