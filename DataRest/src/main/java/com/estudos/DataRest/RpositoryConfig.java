package com.estudos.DataRest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.estudos.DataRest.Repository.UserEventHandler;

@Configuration
public class RpositoryConfig {

	@Bean
	UserEventHandler userEventHandler() {
		return new UserEventHandler() {
		};
	}
}
