package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import com.example.demo.util.ViewNames;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class StudentController {

	
 private final StudentService studentService;
	
	
 @Autowired
 public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
 
 
	@GetMapping ("/students")
	public String getAllStudents(Model model)
	{
	     model.addAttribute("students",studentService.findAll());
	     log.info("model");
	     return ViewNames.STUDENTS;
	}



}
