package com.app.ridebookingapp.dto;

import java.text.AttributedString;

public class UserRegistrationDto {
	private String userName;
	private String userEmail;
	private String userPassword;
	private Long userMobile;
	
	public UserRegistrationDto() {}
	
	public UserRegistrationDto(String userName, String userEmail, String userPassword, Long userMobile) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userMobile = userMobile;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Long getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(Long userMobile) {
		this.userMobile = userMobile;
	}

}
