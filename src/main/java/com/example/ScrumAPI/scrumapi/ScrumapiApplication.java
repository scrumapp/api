package com.example.ScrumAPI.scrumapi;

import com.example.ScrumAPI.scrumapi.constants.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrumapiApplication {

	public static void main(String[] args) {
		System.out.println(Constants.Roles.PRODUCT_OWNER);
		SpringApplication.run(ScrumapiApplication.class, args);
	}

}
