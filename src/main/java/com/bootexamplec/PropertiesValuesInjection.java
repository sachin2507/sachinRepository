package com.bootexamplec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesValuesInjection {
	
	@Value("${author.phone}") 
	private String phone;
	
	@GetMapping("/home")
	public String greeting(@Value("${author.name}") String nameOfAuthor)
	{
		
		return "good morning "+nameOfAuthor+" phone ";
	}

}
