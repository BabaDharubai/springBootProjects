/**
 * 
 */
package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.Student;
import com.studentapp.repo.IStudentRepository;

/**
 * @author BabaFakruddinDharubai
 *
 */
@Service
public class StudentServiceImpl implements IStudentService {

	IStudentRepository studentRepository;
	
	
	/**
	 * @param studentRepository the studentRepository to set
	 */
	@Autowired
	public void setStudentRepository(IStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);

	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);

	}

	@Override
	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(studentId);
	}

	@Override
	public Student getById(int studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).get();
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public List<Student> getByDepartment(String department) {
		// TODO Auto-generated method stub
		return studentRepository.findByDepartment(department);
	}

	@Override
	public List<Student> getByCity(String city) {
		// TODO Auto-generated method stub
		return studentRepository.findByCity(city);
	}

	@Override
	public List<Student> getByCityAndDepartment(String city, String depatment) {
		// TODO Auto-generated method stub
		return studentRepository.findByCityAndDepartment(city, depatment);
	}

	@Override
	public List<Student> getByCityState(String city, String state) {
		// TODO Auto-generated method stub
		return studentRepository.findByCityState(city, state);
	}

}
