package com.example.anotherPractice.repositories;

import com.example.anotherPractice.module.AnotherPracticeModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnotherPracticeRepository extends JpaRepository<AnotherPracticeModule, Long> {
}
