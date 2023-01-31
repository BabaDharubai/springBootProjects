/**
 * 
 */
package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.Address;
import com.studentapp.repo.IAddressRepository;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class AddressServiceImpl implements IAddressService {

	IAddressRepository addressRepository;
	
	/**
	 * @param addressRepository the addressRepository to set
	 */
	@Autowired
	public void setAddressRepository(IAddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public List<Address> getByName(String studentname) {
		// TODO Auto-generated method stub
		//return addressRepository.findByName(studentname);
		return addressRepository.findByName(studentname);
	}

	@Override
	public List<Address> getByDepartment(String department) {
		// TODO Auto-generated method stub
		return addressRepository.findByDepartment(department);
	}

	@Override
	public List<Address> getByNameAndCity(String studentname, String city) {
		// TODO Auto-generated method stub
		return addressRepository.findByNameAndCity(studentname, city);
	}

	@Override
	public Address getByStudentId(int studentId) {
		// TODO Auto-generated method stub
		return addressRepository.findByStudentId(studentId);
	}

	@Override
	public List<Address> getByNameAndStreetname(String studentname, String streetname) {
		// TODO Auto-generated method stub
		return addressRepository.findByNameAndStreetname(studentname, streetname);
	}

	@Override
	public List<Address> getByCity(String city) {
		// TODO Auto-generated method stub
		return addressRepository.findByCity(city);
	}

}
