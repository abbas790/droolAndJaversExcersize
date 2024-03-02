package com.example.usingJaverseInspringboot.Resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usingJaverseInspringboot.Domain.Teacher;
import com.example.usingJaverseInspringboot.Repository.TeacherRepository;

@RestController
@RequestMapping("teacher/")
public class TeacherResource {
    final private TeacherRepository teacherRepository;

    public TeacherResource(TeacherRepository teacherRepository){
         this.teacherRepository=teacherRepository;
    }
    @GetMapping("get")
    public ResponseEntity<List<Teacher>> getStudents(){
      return new ResponseEntity<List<Teacher>>(teacherRepository.findAll(),HttpStatus.OK);
    }

    @PostMapping("save")
    public void save(@RequestBody Teacher teacher){
       teacherRepository.save(teacher);
    }
    
}