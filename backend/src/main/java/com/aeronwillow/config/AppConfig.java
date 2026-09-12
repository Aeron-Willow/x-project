package com.aeronwillow.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aeronwillow.model.User;
import com.aeronwillow.services.UserService;

@Configuration
public class AppConfig {

	@Bean
	public UserService userService() {
		UserService userService = new UserService();

		List<User> userList = new ArrayList<>();
		userList.add(new User("Aeron"));
		userList.add(new User("Alper"));

		userService.setUserList(userList);
		
		return userService;
	}
}
