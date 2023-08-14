package co.gov.coran.licencias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.swing.*;
import java.sql.SQLOutput;

@SpringBootApplication

public class LicenciasApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LicenciasApplication.class, args);
	 }

}



