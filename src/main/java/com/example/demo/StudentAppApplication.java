package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Model.Student;
import com.example.demo.repo.StudentRepo;  


@SpringBootApplication
public class StudentAppApplication implements CommandLineRunner{

	@Autowired
	private StudentRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s1=new Student("prince","Hyderabad","pk22cs@gmail.com");
		Student s2=new Student("Ajit","Bihar","aj@gmail.com");
		Student s3=new Student("Rahul","Bhopal","rahuls@gmail.com");
		Student s4=new Student("Deepak","Hyderabad","dekcs@gmail.com");
		
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);
		
	}

}
