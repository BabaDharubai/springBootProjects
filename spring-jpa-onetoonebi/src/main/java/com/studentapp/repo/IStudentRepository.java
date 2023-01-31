/**
 * 
 */
package com.studentapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;

/**
 * @author BabaFakruddinDharubai
 *
 */
@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByDepartment(String department);
	
	List<Student> findByAddressCity(String city);
	
	//select * from newstudent s inner join address a on s.address_id=a.address_id where city='hyderabad';
	@Query("from Student s inner join s.address a where a.city=?1")
	List<Student> findByCity(String city);
	
	
	@Query("from Student s inner join s.address a on a.city=?1 where s.department=?2") 
	List<Student> findByCityAndDepartment(String city,String depatment);
	
	@Query("from Student s inner join s.address a on (a.city=?1 and a.state=?2)")
	List<Student> findByCityState(String city,String state);
}
