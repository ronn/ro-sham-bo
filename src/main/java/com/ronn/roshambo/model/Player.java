package com.ronn.roshambo.model;

public class Player {

  private final String chosenShape;

  public Player(String chosenShape) {
    this.chosenShape = chosenShape;
  }
/*
  public Shape generateChosenShape() {
    Shape shape = PlayingType.ALWAYS_ROCK.equals(playingType)
        ? new Rock()
        : Shape.getRandomShape();

    this.setChosenShape(shape.getName());

    return shape;
  }*/

  public String getChosenShape() {
    return this.chosenShape;
  }
}
