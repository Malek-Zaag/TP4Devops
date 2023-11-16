package com.example.tp4.service;


import com.example.tp4.entity.Student;
import com.example.tp4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public List<Student> getStudents() {
        return this.studentRepository.findAll();
    }


    public Student addNewStudent(Student student) {
        Optional<Student> optionalStudent = this.studentRepository.findByEmail(student.getEmail());
        if (optionalStudent.isPresent()) {
            throw new IllegalStateException("email is taken, please try a new one");
        } else if (!checkEmail(student.getEmail())) {
            throw new IllegalStateException("email is not corresponding to a valid one");
        } else if (!checkFirstname(student.getFirstname())) {
            throw new IllegalStateException("firstname is too short !!!");
        }
        return this.studentRepository.save(student);
    }

    public boolean checkEmail(String email) {
        if ((email.length() >= 12) && email.toLowerCase().contains("@")) {
            return true;
        } else return false;
    }

    public boolean checkFirstname(String firstname) {
        if (firstname.length() > 5) {
            return true;
        } else return false;
    }
}
