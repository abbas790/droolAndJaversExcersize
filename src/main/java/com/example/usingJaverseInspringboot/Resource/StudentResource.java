package com.example.usingJaverseInspringboot.Resource;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usingJaverseInspringboot.Domain.Student;
import com.example.usingJaverseInspringboot.Repository.StudentRepository;

@RestController
@RequestMapping("student/")
public class StudentResource {
    final private StudentRepository studentRepository;
    @Autowired
    private KieContainer kieContainer;
    public StudentResource(StudentRepository studentRepository){
         this.studentRepository=studentRepository;
    }
    @GetMapping("get")
    public ResponseEntity<List<Student>> getStudents(){
      return new ResponseEntity<List<Student>>(studentRepository.findAll(),HttpStatus.OK);
    }

    @PostMapping("save")
    public Student save(@RequestBody Student student){
      KieSession kieSession = kieContainer.newKieSession();
      // kieSession.setGlobal("orderDiscount", orderDiscount);
      kieSession.insert(student);
      kieSession.fireAllRules();
      kieSession.dispose();
      return student;
      //  studentRepository.save(student);
    }
    
}
