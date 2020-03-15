package com.nantaaditya.tutorial.spring.service.impl;

import com.nantaaditya.tutorial.spring.entity.Student;
import com.nantaaditya.tutorial.spring.helper.ConverterHelper;
import com.nantaaditya.tutorial.spring.model.StudentModel;
import com.nantaaditya.tutorial.spring.repository.StudentRepository;
import com.nantaaditya.tutorial.spring.service.CreateStudentCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * created by pramuditya.anantanur
 **/
@Service
@Slf4j
public class CreateStudentCommandImpl implements CreateStudentCommand {
  
  @Autowired
  private StudentRepository studentRepository;
  
  @Override
  public Mono<Boolean> execute(StudentModel studentModel) {
    return studentRepository.save(ConverterHelper.copy(studentModel, Student::new))
        .map(result -> Boolean.TRUE);
  }
}
