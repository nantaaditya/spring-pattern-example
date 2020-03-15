package com.nantaaditya.tutorial.spring.repository;

import com.nantaaditya.tutorial.spring.entity.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * created by pramuditya.anantanur
 **/
@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student, String> {
}
