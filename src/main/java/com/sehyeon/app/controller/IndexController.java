package com.sehyeon.app.controller;

import com.sehyeon.app.entity.*;
import com.sehyeon.app.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    private final PersonRepsitory personRepsitory;

    @Autowired
    private SocialMediaRepository socialMediaRepository;

    @Autowired
    private InterestsRepository interestsRepository;

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private WorkRepository workRepository;

    public IndexController(PersonRepsitory personRepsitory) {
        this.personRepsitory = personRepsitory;
        System.out.println("repository!");
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
