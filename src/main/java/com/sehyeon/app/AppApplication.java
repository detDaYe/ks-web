package com.sehyeon.app;

import com.sehyeon.app.entity.*;
import com.sehyeon.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final PersonRepsitory personRepsitory;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(PersonRepsitory personRepsitory, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository) {
		this.personRepsitory = personRepsitory;
		this.socialMediaRepository = socialMediaRepository;
		this.interestsRepository = interestsRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepsitory.save(new Person("박세현", "보안", "hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anonymous", "anonymous", "anonymous", ""));
		interestsRepository.save(new Interests("Interest-1"));
		interestsRepository.save(new Interests("Interest-2"));
		skillRepository.save(new Skill("Algebra", 3));
		skillRepository.save(new Skill("Cryptography", 6));
		workRepository.save(new Work("Student", "KYU", "4 year", "학부생활"));
	}
}
