package com.bootexamplec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyOdnaryController {
	
	@GetMapping("/index")
	public String home() {
		
		return "index";
	}

}
