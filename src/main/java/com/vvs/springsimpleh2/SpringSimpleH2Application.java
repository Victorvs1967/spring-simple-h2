package com.vvs.springsimpleh2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vvs.springsimpleh2.model.User;
import com.vvs.springsimpleh2.repository.UserRepository;

@SpringBootApplication
public class SpringSimpleH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSimpleH2Application.class, args);
	}

	// Create init users in database
	@Bean
	ApplicationRunner init(UserRepository userRepository) {
		return args -> {

			List<User> users = new ArrayList<>();

			User user01 = User.builder()
				.username("user")
				.password("password")
				.email("user@mail.me")
			.build();
			User user02 = User.builder()
				.username("victor")
				.password("victor")
				.email("victor@mail.me")
			.build();

			users.add(user01);
			users.add(user02);
			
			userRepository.saveAll(users);
		};
	}
}
