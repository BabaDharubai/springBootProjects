/**
 * 
 */
package com.bookapp.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.bookapp.repository.JwtUserServiceImpl;

import io.jsonwebtoken.ExpiredJwtException;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Component
public class JwtRequestFilter extends OncePerRequestFilter{

	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private JwtUserServiceImpl jwtUserServiceImpl;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//check the request for header with name authorization
		
		String header=request.getHeader("Authorization");
		//check if the header starts with Bearer
		String jwtToken=null;
		String username=null;
		if(header!=null && header.startsWith("Bearer ")) {
			//Bearer dssafasfwefewfwfwq
			jwtToken=header.substring(7);
			try {
			username=jwtTokenUtil.getUsernameFromToken(jwtToken);
			//get the username from the token so that we can check the name
			}catch(IllegalArgumentException e) {
				System.out.println("cannot get name");
			}catch(ExpiredJwtException e) {
				System.out.println("Token has expired");
			}
		}else {
			logger.warn("Invalid header");
		}
		//if emai1 is not null ,check in db && get the context from SecurityContextHolder
		if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			//check in db call the service method
			UserDetails userDetails =jwtUserServiceImpl.loadUserByUsername(username);
			//got all the details of the user so validate the token for signature
			//if the token is a valid token - configure security
			if(jwtTokenUtil.validateToken(jwtToken, userDetails)) {
				UsernamePasswordAuthenticationToken authToken=
						new UsernamePasswordAuthenticationToken(userDetails, null,userDetails.getAuthorities());
				//set the authentication type to the context
				SecurityContextHolder.getContext().setAuthentication(authToken);
			}
			
		}
		//this will be called first - for /register and /login
		filterChain.doFilter(request, response);
	}

	
}
