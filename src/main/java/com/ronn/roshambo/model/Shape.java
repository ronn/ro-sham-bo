package com.ronn.roshambo.model;

import com.ronn.roshambo.model.shape.Paper;
import com.ronn.roshambo.model.shape.Rock;
import com.ronn.roshambo.model.shape.Scissors;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Shape {

  public abstract String getName();

  public abstract Boolean beats(Shape shape);

  public static Shape getRandomShape() {
    List<Shape> shapes = Arrays.asList(new Rock(), new Paper(), new Scissors());
    Random rand = new Random();

    return shapes.get(rand.nextInt(shapes.size()));
  }

  //TODO This should be here
  /*public Shape generateChosenShape() {
    Shape shape = PlayingType.ALWAYS_ROCK.equals(playingType)
        ? new Rock()
        : Shape.getRandomShape();

    this.setChosenShape(shape.getName());

    return shape;
  }*/
}
