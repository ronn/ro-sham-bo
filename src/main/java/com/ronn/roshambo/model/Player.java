package com.ronn.roshambo.model;

import com.ronn.roshambo.model.shape.Rock;

public class Player {

  private final PlayingType playingType;
  private String chosenShape;

  public Player(PlayingType playingType) {
    this.playingType = playingType;
  }

  public Shape generateChosenShape() {
    Shape shape = PlayingType.ALWAYS_ROCK.equals(playingType)
        ? new Rock()
        : Shape.getRandomShape();

    this.setChosenShape(shape.getName());

    return shape;
  }

  public String getChosenShape() {
    return this.chosenShape;
  }

  private void setChosenShape(String chosenShape) {
    this.chosenShape = chosenShape;
  }
}
