package com.sehyeon.app.controller;

import com.sehyeon.app.domain.Student;
import com.sehyeon.app.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final StudentRepository studentRepository;

    public IndexController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public String index(Model model){
        //System.out.println("IndexController.java index());
        //studentRepository.findAll().forEach(obj -> System.out.println(obj.getName()));
        Iterable<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "index";
    }
}
