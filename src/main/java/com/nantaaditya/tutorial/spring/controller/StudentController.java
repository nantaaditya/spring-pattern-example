package com.nantaaditya.tutorial.spring.controller;

import com.nantaaditya.tutorial.spring.model.Student;
import com.nantaaditya.tutorial.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * created by pramuditya.anantanur
 **/
@RestController
@RequestMapping(value = "/students")
public class StudentController {
  @Autowired
  private StudentService studentService;
  
  @PostMapping(
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public Mono<Student> save(@RequestBody Student student) {
    return studentService.save(student)
        .log();
  }
  
  @GetMapping(
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public Flux<Student> findAll() {
    return studentService.findAll()
        .log();
  }
}
