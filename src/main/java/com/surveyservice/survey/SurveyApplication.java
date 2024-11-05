package com.surveyservice.survey;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveyApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return Args->{
			System.out.println("test");
		};
	}


}
