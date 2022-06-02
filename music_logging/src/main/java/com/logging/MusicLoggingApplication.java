package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicLoggingApplication {

	private static final Logger logger = LoggerFactory.getLogger(MusicLoggingApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MusicLoggingApplication.class, args);
	}
}
