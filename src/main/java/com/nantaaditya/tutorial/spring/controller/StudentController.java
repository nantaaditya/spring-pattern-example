package com.nantaaditya.tutorial.spring.controller;

import com.nantaaditya.tutorial.spring.command.CommandExecutor;
import com.nantaaditya.tutorial.spring.model.EmptyRequest;
import com.nantaaditya.tutorial.spring.model.StudentModel;
import com.nantaaditya.tutorial.spring.service.CreateStudentCommand;
import com.nantaaditya.tutorial.spring.service.GetStudentCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.List;

/**
 * created by pramuditya.anantanur
 **/
@RestController
@RequestMapping(value = "/students")
public class StudentController {
  @Autowired
  private CommandExecutor commandExecutor;
  
  @PostMapping(
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public Mono<Boolean> save(@RequestBody StudentModel student) {
    return commandExecutor.execute(CreateStudentCommand.class, student);
  }
  
  @GetMapping(
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public Mono<List<StudentModel>> findAll() {
    return commandExecutor.execute(GetStudentCommand.class, EmptyRequest.getInstance());
  }
}
