/**
 * 
 */
package com.bookapp.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bookapp.model.JwtUser;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class JwtUserServiceImpl implements UserDetailsService{
	
	@Autowired
	private IJwtUserRepository iJwtUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		JwtUser jwtUser =iJwtUserRepository.findByUsername(username);
		if(jwtUser==null) {
			throw new UsernameNotFoundException("Invalid username id");
		}
		String uname=jwtUser.getUsername();
		String password=jwtUser.getPassword();
		List<String> authorities=jwtUser.getAuthorities();
		
		List<GrantedAuthority> grantedAuthorities=authorities.stream()
				.map(authority->new SimpleGrantedAuthority(authority))
				.collect(Collectors.toList());
//		List<GrantedAuthority> grantedAuthority=new ArrayList<>();
//		
//		for(String a:authorities) {
//			SimpleGrantedAuthority s1=new SimpleGrantedAuthority(a);
//			grantedAuthority.add(s1);
//			
//		}
		UserDetails user=new User(uname,password,grantedAuthorities);
		return user;
	}
	
	public String registerUser(JwtUser jwtUser) {
		iJwtUserRepository.save(jwtUser);
		return "added";
	}

}
