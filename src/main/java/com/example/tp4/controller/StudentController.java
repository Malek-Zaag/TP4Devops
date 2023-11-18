package com.example.tp4.controller;


import com.example.tp4.entity.Student;
import com.example.tp4.service.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Data
@RestController
public class StudentController {
    @Autowired
    private final StudentService studentService;
    public String result = "hello world";

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return this.studentService.getStudents();
    }

    @GetMapping("/")
    public String helloWorld() {
        return "hello world !";
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return this.studentService.addNewStudent(student);
    }
}
