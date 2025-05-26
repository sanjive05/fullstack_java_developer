package com.spring.data_jpa.service_and_controller;
import com.spring.data_jpa.entity.Student;
import com.spring.data_jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/api/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        System.out.println(student.toString());
        Student savedStudent = studentRepository.save(student);

        return new ResponseEntity<>(savedStudent, HttpStatus.OK);
    }

    @GetMapping("/api/students")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(studentRepository.findAll(),HttpStatus.OK);
    }
}
