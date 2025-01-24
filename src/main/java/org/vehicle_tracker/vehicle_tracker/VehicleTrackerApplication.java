package org.vehicle_tracker.vehicle_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Vehicle Tracker API", version = "1.0", description = "A API Designed To manage the vehicle tracking Information", 
					contact = @Contact(name = "Harshith N J", email = "Harshith.dev2024@outlook.com")))
public class VehicleTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleTrackerApplication.class, args);
	}

}
