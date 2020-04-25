package com.sehyeon.app;

import com.sehyeon.app.entity.*;
import com.sehyeon.app.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final PersonRepsitory personRepsitory;

	@Autowired
	private SocialMediaRepository socialMediaRepository;
	@Autowired
	private InterestsRepository interestsRepository;
	@Autowired
	private SkillRepository skillRepository;
	@Autowired
	private WorkRepository workRepository;

	public AppApplication(PersonRepsitory personRepsitory) {
		this.personRepsitory = personRepsitory;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepsitory.save(new Person("박세현", "보안", "hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anonymous", "anonymous", "anonymous", ""));
		interestsRepository.save(new Interests("X-Plane 11"));
		interestsRepository.save(new Interests("VATSIM"));
		skillRepository.save(new Skill("Algebra", -10));
		skillRepository.save(new Skill("Cryptography", 99));
		workRepository.save(new Work("KYU", "KYU", "4 year", "nothing"));
	}
}
