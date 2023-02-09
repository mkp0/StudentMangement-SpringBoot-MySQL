package com.student.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.student.Entity.StudentEntity;
import com.student.student.repos.StudentRepo;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo doe;

    
    @GetMapping("/student")
    public List<StudentEntity> getAllStudent(){
        List<StudentEntity> studentDB = new ArrayList<StudentEntity>();
        studentDB = doe.findAll();
        return studentDB;
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        StudentEntity  st= doe.findById(id).get();
        if(st==null){
            return "something went wrong or id dont exist";
        }
        doe.deleteById(id);
        return "deleted";
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody StudentEntity st){
        st =  doe.save(st);
        return "inserted";
    }
}
