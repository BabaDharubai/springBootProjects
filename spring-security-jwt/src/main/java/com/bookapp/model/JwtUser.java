/**
 * 
 */
package com.bookapp.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Entity
@Table(name="jwtuser")
public class JwtUser {
	
	private String username;
	private String email;
	private String password;
	@Id
	@GeneratedValue
	private Integer userId;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> authorities;
	/**
	 * 
	 */
	public JwtUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param username
	 * @param email
	 * @param password
	 * @param userId
	 * @param authorities
	 */
	public JwtUser(String username, String email, String password, Integer userId, List<String> authorities) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.userId = userId;
		this.authorities = authorities;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the authorities
	 */
	public List<String> getAuthorities() {
		return authorities;
	}
	/**
	 * @param authorities the authorities to set
	 */
	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}
	@Override
	public String toString() {
		return "JwtUser [username=" + username + ", email=" + email + ", password=" + password + ", userId=" + userId
				+ ", authorities=" + authorities + "]";
	}
	
	

}
