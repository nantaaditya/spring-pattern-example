package com.nantaaditya.tutorial.spring;

import com.nantaaditya.tutorial.spring.service.Shape;
import com.nantaaditya.tutorial.spring.service.impl.Circle;
import com.nantaaditya.tutorial.spring.service.impl.Rectangle;
import com.nantaaditya.tutorial.spring.service.impl.Square;

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
