package com.nantaaditya.tutorial.spring.service;

import com.nantaaditya.tutorial.spring.model.Student;

import java.util.List;

/**
 * created by pramuditya.anantanur
 **/
public interface StudentService {
  
  void save(Student student);
  
  List findAll();
}
