package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	private final StudentRepository studentRepositroy;
	
	@Autowired
	public StudentServiceImpl (StudentRepository studentRepository)
	{
		this.studentRepositroy = studentRepository;
	}

	@Override
	public List<Student> findAll() {
		
		List <Student> students = 
				 new ArrayList <Student>((List <Student>)this.studentRepositroy.findAll());
				
		return students ;
		
	}
	

}
