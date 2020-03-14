package com.nantaaditya.tutorial.spring.service;

import java.util.ArrayList;
import java.util.List;

/**
 * created by pramuditya.anantanur
 **/
public class ShapeMaker {
  public static void main(String[] args) {
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape square = new Square();

    List<Shape> shapes = new ArrayList<>();
    shapes.add(circle);
    shapes.add(rectangle);
    shapes.add(square);
    
    shapes.stream()
        .forEach(shape -> shape.draw());
  }
}
