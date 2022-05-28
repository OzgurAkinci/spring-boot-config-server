package com.app.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Properties;

@SpringBootApplication
public class ConfigClientApplication {
	@Autowired
	Environment env;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);

	}

}
