package com.example.tp4.service;


import com.example.tp4.entity.Student;
import com.example.tp4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
@Autowired
public StudentRepository studentRepository;
    public List<Student> getStudents() {
        return this.studentRepository.findAll();
    }
}
