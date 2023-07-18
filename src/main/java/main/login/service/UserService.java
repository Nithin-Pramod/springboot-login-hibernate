package main.login.service;

import main.login.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import main.login.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
