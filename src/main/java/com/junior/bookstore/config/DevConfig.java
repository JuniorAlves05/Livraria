package com.junior.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.junior.bookstore.BookstoreApplication;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private BookstoreApplication dbService;
	

}
