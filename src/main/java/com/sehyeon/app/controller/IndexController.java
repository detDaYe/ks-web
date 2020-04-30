package com.sehyeon.app.controller;

import com.sehyeon.app.entity.*;
import com.sehyeon.app.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    private final PersonRepsitory personRepsitory;
    private final SocialMediaRepository socialMediaRepository;
    private final  InterestsRepository interestsRepository;
    private final SkillRepository skillRepository;
    private  final WorkRepository workRepository;

    public IndexController(PersonRepsitory personRepsitory, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository) {
        this.personRepsitory = personRepsitory;
        this.socialMediaRepository = socialMediaRepository;
        this.interestsRepository = interestsRepository;
        this.skillRepository = skillRepository;
        this.workRepository = workRepository;
        //System.out.println("repository!");
    }

    @GetMapping("/")
    public String index(Model model){
        //System.out.println("IndexController.java index());
        Person person = personRepsitory.findAll().stream().findFirst().orElse(null);
        SocialMedia socialMedia = socialMediaRepository.findAll().stream().findFirst().orElse(null);

        model.addAttribute("person", person);

        model.addAttribute("socialMedia", socialMedia);

        List<Interests> interests = interestsRepository.findAll();
        model.addAttribute("interests", interests);

        List<Skill> skills = skillRepository.findAll();
        model.addAttribute("skills", skills);

        List<Work> works = workRepository.findAll();
        model.addAttribute("works", works);


        return "resume";
    }
}
