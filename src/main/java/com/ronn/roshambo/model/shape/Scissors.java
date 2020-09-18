package com.ronn.roshambo.model.shape;

import com.ronn.roshambo.model.Shape;

public class Scissors extends Shape {

  public String getName(){
    return "Scissors";
  }

  @Override
  public Boolean beats(Shape shape) {
    return shape instanceof Paper;
  }
}
