package com.gsk.magic;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagicApplication {
	private static final Logger LOGGER = Logger.getLogger(MagicApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(MagicApplication.class, args);
		LOGGER.info("gokulg");
	}
}
