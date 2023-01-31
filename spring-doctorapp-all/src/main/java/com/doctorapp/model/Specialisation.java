/**
 * 
 */
package com.doctorapp.model;

/**
 * @author BabaFakruddinDharuba
 *
 */
public enum Specialisation {
	PHYSICIAN("General Physicain"),
	DERMA("Dermatologist"),
	INTERNAL("Internal Medicine"),
	CARDIO("Cardiologist");
	
	
	private String specialityName;

	/**
	 * @param specailityName
	 */
	private Specialisation(String specialityName) {
		this.specialityName = specialityName;
	}
	
	
	public String getSpeciality() {
		return specialityName;
	}
}
