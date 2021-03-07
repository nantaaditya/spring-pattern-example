package com.nantaaditya.tutorial.spring.service.impl;

import com.nantaaditya.tutorial.spring.model.Student;
import com.nantaaditya.tutorial.spring.repository.StudentRepository;
import com.nantaaditya.tutorial.spring.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * created by pramuditya.anantanur
 **/
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
  
  @Autowired
  private StudentRepository studentRepository;
  
  @Override
  public Mono<Student> save(Student student) {
    return studentRepository.save(student);
  }

  @Override
  public Flux<Student> findAll() {
    return studentRepository.findAll();
  }
}
