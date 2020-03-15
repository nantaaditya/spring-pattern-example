package com.nantaaditya.tutorial.spring.model;

/**
 * created by pramuditya.anantanur
 **/
public class EmptyRequest {
  private static EmptyRequest INSTANCE = null;
  
  private EmptyRequest() {}
  
  public static EmptyRequest getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new EmptyRequest();
    }
    return INSTANCE;
  }
}
