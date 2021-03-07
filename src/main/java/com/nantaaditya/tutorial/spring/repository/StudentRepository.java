package com.nantaaditya.tutorial.spring.repository;

import com.nantaaditya.tutorial.spring.model.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * created by pramuditya.anantanur
 **/
public interface StudentRepository extends ReactiveMongoRepository<Student, String> {
}
