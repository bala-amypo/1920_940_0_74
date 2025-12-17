package com.example.aiml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aiml.entity.Student;

@repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
    }   