package com.ronn.roshambo.model.shape;

import com.ronn.roshambo.model.Shape;

public class Rock extends Shape {

  @Override
  public Boolean beats(Shape shape) {
    return shape instanceof Scissors;
  }
}
