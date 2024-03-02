package com.example.usingJaverseInspringboot.Repository;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usingJaverseInspringboot.Domain.Teacher;

@JaversSpringDataAuditable
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    
}
