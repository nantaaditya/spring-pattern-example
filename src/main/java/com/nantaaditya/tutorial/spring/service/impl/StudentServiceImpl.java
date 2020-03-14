package com.nantaaditya.tutorial.spring.service.impl;

import com.nantaaditya.tutorial.spring.model.Student;
import com.nantaaditya.tutorial.spring.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * created by pramuditya.anantanur
 **/
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
  private List<Student> students = new ArrayList<>();
  
  @Override
  public void save(Student student) {
    students.add(student);
    log.info("save students: {}", student);
  }

  @Override
  public List findAll() {
    return students;
  }
}
