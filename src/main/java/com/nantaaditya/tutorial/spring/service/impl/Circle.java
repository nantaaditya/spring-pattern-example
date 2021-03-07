package com.nantaaditya.tutorial.spring.service.impl;

import com.nantaaditya.tutorial.spring.service.Shape;

/**
 * created by pramuditya.anantanur
 **/
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("draw Circle");
  }
}
