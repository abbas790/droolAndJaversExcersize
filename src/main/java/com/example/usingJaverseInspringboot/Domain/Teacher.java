package com.example.usingJaverseInspringboot.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Teacher {
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    Long id;
    String name;
    String lastName;
}
