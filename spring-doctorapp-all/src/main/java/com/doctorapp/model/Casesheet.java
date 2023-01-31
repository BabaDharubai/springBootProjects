/**
 * 
 */
package com.doctorapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Entity
public class Casesheet {

	@Id
	@GeneratedValue(generator = "case_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="case_gen",sequenceName="case_seq",initialValue=100,allocationSize=1)
	private Integer caseId;
	private String caseType;
	
	@ManyToOne
	@JoinColumn(name="doctor_id")
	@JsonIgnore
	private Doctor doctor;
	/**
	 * 
	 */
	public Casesheet() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param caseType
	 */
	public Casesheet(String caseType) {
		super();
		this.caseType = caseType;
	}
	/**
	 * @return the caseId
	 */
	public Integer getCaseId() {
		return caseId;
	}
	/**
	 * @param caseId the caseId to set
	 */
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
	/**
	 * @return the caseType
	 */
	public String getCaseType() {
		return caseType;
	}
	/**
	 * @param caseType the caseType to set
	 */
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	/**
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}
	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "Casesheet [caseType=" + caseType + "]";
	}
	
	
	
	
}
