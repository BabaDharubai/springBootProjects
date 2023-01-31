/**
 * 
 */
package com.bookapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bookapp.model.AppUser;
import com.bookapp.repository.IUserRepository;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private IUserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		AppUser user=userRepository.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("username not found");
		String uname=user.getUsername();
		String password=user.getPassword();
		GrantedAuthority authority1=new SimpleGrantedAuthority("ADMIN");
		GrantedAuthority authority2=new SimpleGrantedAuthority("USER");
		List<GrantedAuthority> authorities=Arrays.asList(authority1,authority2);
		UserDetails userDetails=new User(uname,password,authorities);
		return userDetails;
	}
	
	public void addUser(AppUser user) {
		userRepository.save(user);
	}

	
}