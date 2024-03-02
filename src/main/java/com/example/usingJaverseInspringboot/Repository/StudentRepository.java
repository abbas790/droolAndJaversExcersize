package com.example.usingJaverseInspringboot.Repository;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usingJaverseInspringboot.Domain.Student;

@JaversSpringDataAuditable
public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
