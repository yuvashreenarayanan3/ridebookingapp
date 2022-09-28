package com.app.ridebookingapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.app.ridebookingapp.dto.UserRegistrationDto;
import com.app.ridebookingapp.model.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);

}
