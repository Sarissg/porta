package com.saris.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {

	@GetMapping("/portada/")
	public String Portada() {
		return "Portada";
	}
}
