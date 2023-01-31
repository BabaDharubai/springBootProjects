/**
 * 
 */
package com.bookapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.bookapp.config.JwtTokenUtil;
import com.bookapp.model.JwtUser;
import com.bookapp.repository.JwtUserServiceImpl;

/**
 * @author BabaFakruddinDharuba
 *
 */
@RestController
@RequestMapping("user-api")
@CrossOrigin("http://localhost:4200")
public class JwtUserController {
	
	private AuthenticationManager authenticationManager;
	
	private JwtTokenUtil jwtTokenUtil;
	
	/**
	 * @param authenticationManager the authenticationManager to set
	 */
	@Autowired
	public void setAuthenticationManager(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	/**
	 * @param jwtTokenUtil the jwtTokenUtil to set
	 */
	@Autowired
	public void setJwtTokenUtil(JwtTokenUtil jwtTokenUtil) {
		this.jwtTokenUtil = jwtTokenUtil;
	}

	private PasswordEncoder passwordEncoder;
	
	
	/**
	 * @param passwordEncoder the passwordEncoder to set
	 */
	@Autowired
	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}
	
	private JwtUserServiceImpl jwtUserServiceImpl;

	/**
	 * @param jwtUserServiceImpl the jwtUserServiceImpl to set
	 */
	@Autowired
	public void setJwtUserServiceImpl(JwtUserServiceImpl jwtUserServiceImpl) {
		this.jwtUserServiceImpl = jwtUserServiceImpl;
	}

	@PostMapping("/authenticate")
	public ResponseEntity<String> loginUser(@RequestBody JwtUser jwtUser) {
		
		authenticate(jwtUser.getUsername(),jwtUser.getPassword());
		String username=jwtUser.getUsername();
		UserDetails userDetails=jwtUserServiceImpl.loadUserByUsername(username);
		
		String token=jwtTokenUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(token);
	}
	
	private void authenticate(String username,String password) {
		try {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		}catch(DisabledException e) {
			System.out.println(e.getMessage());
		}catch(LockedException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@PostMapping("/register")
	public String addUser(@RequestBody JwtUser jwtUser) {
		String password=jwtUser.getPassword();
		
		jwtUser.setPassword(passwordEncoder.encode(password));
		return jwtUserServiceImpl.registerUser(jwtUser);
	}
}
