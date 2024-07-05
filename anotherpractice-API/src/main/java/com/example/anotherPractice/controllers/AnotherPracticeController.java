package com.example.anotherPractice.controllers;

import com.example.anotherPractice.repositories.AnotherPracticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AnotherPracticeController {

    @Autowired
    private AnotherPracticeRepository anotherPracticeRepository;
}
