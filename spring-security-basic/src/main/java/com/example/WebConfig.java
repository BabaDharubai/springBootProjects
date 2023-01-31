/**
 * 
 */
package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author BabaFakruddinDharubai
 *
 */
@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter {

	
	//in memory authentication
	AuthenticationManager a;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		.withUser("Baba")//takes username as parameter
		.password(passwordEncoder().encode("Baba542"))
		.roles("ADMIN","USER")
		.and()
		.withUser("Harish")
		.password(passwordEncoder().encode("Harish121"))
		.roles("USER");
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}

	
	//authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/books/**","/**").hasAnyRole("ADMIN","USER")
		.and()
		.formLogin();
	}
	
	
	
	
}
