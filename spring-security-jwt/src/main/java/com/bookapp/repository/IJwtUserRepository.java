/**
 * 
 */
package com.bookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.model.JwtUser;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Repository
public interface IJwtUserRepository extends JpaRepository<JwtUser,Integer>{
	
	JwtUser findByEmail(String email);
	
	JwtUser findByUsername(String username);

}
