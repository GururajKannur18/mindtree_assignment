package com.mindtree.example.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.mindtree.example.assignment.property.FileStoreProperties;

@SpringBootApplication
@EnableConfigurationProperties({ FileStoreProperties.class })
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

}
