package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDatabase2Application implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(StudentDatabase2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	  List<Student> student = studentRepo.findAll() ;
		   student.forEach(System.out::println);
	}

}
