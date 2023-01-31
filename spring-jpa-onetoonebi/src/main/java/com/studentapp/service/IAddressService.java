/**
 * 
 */
package com.studentapp.service;

import java.util.List;

import com.studentapp.model.Address;

/**
 * @author BabaFakruddinDharuba
 *
 */
public interface IAddressService {
	
	List<Address> getByName(String studentname);
	List<Address> getByDepartment(String department);
	List<Address> getByNameAndCity(String studentname,String city);
	Address getByStudentId(int studentId);
	List<Address> getByNameAndStreetname(String studentname,String streetname);
	List<Address> getByCity(String city);
}
