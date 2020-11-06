package com.example.demo.bootstrap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

	private final StudentRepository studentRepository;
	
	public DataLoader(StudentRepository studentRepository)
	{
		this.studentRepository = studentRepository;
	}
	@Override
	public void run(String... args) throws Exception {
		
		List<Student> students = new ArrayList<Student>();
		this.studentRepository.findAll().forEach(students::add);
	
		if (students.isEmpty()) {
			this.load();
		}
			
	}
	
	private void load ()
	{
		Student ivan = new Student();
		ivan.setFirstName("Ivan");
		ivan.setLastName("Ivanov");
		ivan.setCity("Plovdiv");
		
		this.studentRepository.save(ivan);
		
		log.info("Loaded {}",ivan.getFirstName());
	}

}
