package com.cegeka.upsun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class UpsunApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpsunApplication.class, args);
	}

}
