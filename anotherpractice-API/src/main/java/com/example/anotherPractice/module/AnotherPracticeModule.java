package com.example.anotherPractice.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AnotherPracticeModule {

    @Id
    @GeneratedValue
    private Long id;

    private String dogBreed;

    private String dogName;

    public AnotherPracticeModule() {
    }

    public AnotherPracticeModule(String dogBreed, String dogName) {
        this.dogBreed = dogBreed;
        this.dogName = dogName;
    }

    public Long getId() {
        return id;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }
}
