package com.ronn.roshambo.model.shape;

import com.ronn.roshambo.model.Shape;

public class Paper extends Shape {

  @Override
  public Boolean beats(Shape shape) {
    return shape instanceof Rock;
  }
}
