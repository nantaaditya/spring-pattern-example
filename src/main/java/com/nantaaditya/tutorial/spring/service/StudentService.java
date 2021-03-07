package com.nantaaditya.tutorial.spring.service;

import com.nantaaditya.tutorial.spring.model.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * created by pramuditya.anantanur
 **/
public interface StudentService {
  
  Mono<Student> save(Student student);
  
  Flux<Student> findAll();
}
