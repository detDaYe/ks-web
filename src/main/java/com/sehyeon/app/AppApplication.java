package com.sehyeon.app;

import com.sehyeon.app.domain.Student;
import com.sehyeon.app.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final StudentRepository studentRepository;

	public AppApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//goal? save dummy data
		studentRepository.save(new Student("홍길동", "길동@길동닷컴", "01012345678"));

	}
}
