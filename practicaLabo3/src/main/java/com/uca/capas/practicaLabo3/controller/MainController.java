package com.uca.capas.practicaLabo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/ejemplo1")
	@ResponseBody
	public String ejemplo1() {
		return "BIENVENIDOS A PROGRAMACION N CAPAS";
	}
	
}
