package com.uca.capas.practicaLabo3.controller;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.practicaLabo3.domain.Student;

@Controller
public class MainController {

	@GetMapping(path="/ejemplo1",produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody 
	public String ejemplo1() {
		return "BIENVENIDOS A\n"+ "PROGRAMACION N CAPAS";
	}
	
	@GetMapping("/ejemplo2")
	@ResponseBody
	public List<Student> ejemplo2(){
		return Arrays.asList(
				new Student("Marvin", "Ramirez", "10/10/2017", "Ing Inf", true),
				new Student("Marvin2", "Ramirez2", "10/10/2019", "Ing civil", false)
		);
	}
	
	@GetMapping("/inicio")
	public String inicio(Student student) {
		return "index";
	}
	
	@PostMapping("/dataform")
	public	ModelAndView procesar(Student student) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("prueba");
		mav.addObject("estado",student.delegateEstado());
		mav.addObject("student",student);
		return mav;
		
	}
}
