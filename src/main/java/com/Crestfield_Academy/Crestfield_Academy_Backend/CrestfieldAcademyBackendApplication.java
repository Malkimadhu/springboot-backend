package com.Crestfield_Academy.Crestfield_Academy_Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;

@SpringBootApplication
public class CrestfieldAcademyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrestfieldAcademyBackendApplication.class, args);
	}
		@Bean
		public ModelMapper modelMapper(){
		return  new ModelMapper();
		}
}
