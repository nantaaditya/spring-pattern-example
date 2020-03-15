package com.nantaaditya.tutorial.spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created by pramuditya.anantanur
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {
  private String id;
  private String name;
  private int age;
}
