package com.nantaaditya.tutorial.spring.service.impl;

import com.nantaaditya.tutorial.spring.helper.ConverterHelper;
import com.nantaaditya.tutorial.spring.model.EmptyRequest;
import com.nantaaditya.tutorial.spring.model.StudentModel;
import com.nantaaditya.tutorial.spring.repository.StudentRepository;
import com.nantaaditya.tutorial.spring.service.GetStudentCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * created by pramuditya.anantanur
 **/
@Service
public class GetStudentCommandImpl implements GetStudentCommand {
  
  @Autowired
  private StudentRepository studentRepository;
  
  @Override
  public Mono<List<StudentModel>> execute(EmptyRequest request) {
    return findAll();
  }
  
  private Mono<List<StudentModel>> findAll() {
    return studentRepository.findAll()
        .collectList()
        .map(results -> ConverterHelper.copy(results, StudentModel::new));
  }
}
