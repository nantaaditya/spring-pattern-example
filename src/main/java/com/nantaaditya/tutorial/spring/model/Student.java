package com.nantaaditya.tutorial.spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * created by pramuditya.anantanur
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("students")
public class Student {
  @Id
  private int id;
  
  private String name;
  
  private int age;
}
