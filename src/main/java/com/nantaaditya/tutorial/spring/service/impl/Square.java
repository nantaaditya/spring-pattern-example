package com.nantaaditya.tutorial.spring.service.impl;

import com.nantaaditya.tutorial.spring.service.Shape;

/**
 * created by pramuditya.anantanur
 **/
public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("draw Square");
  }
}
