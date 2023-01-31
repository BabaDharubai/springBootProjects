/**
 * 
 */
package com.studentapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Address;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer>{
	
	@Query("from Address a inner join a.student s where s.name=?1")
	List<Address> findByName(String studentname);
	@Query("from Address a inner join a.student s where s.department=?1")
	List<Address> findByDepartment(String department);
	@Query("from Address a inner join a.student s where s.name=?1 and a.city=?2")
	List<Address> findByNameAndCity(String studentname,String city);
	@Query("from Address a inner join a.student s where s.studentId=?1")
	Address findByStudentId(int studentId);
	@Query("from Address a inner join a.student s where s.name=?1 and a.streetname=?2")
	List<Address> findByNameAndStreetname(String studentname,String streetname);
	List<Address> findByCity(String city);
}
