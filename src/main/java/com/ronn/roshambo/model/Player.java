package com.ronn.roshambo.model;

import com.ronn.roshambo.model.shape.Rock;

public class Player {

  private final PlayingType playingType;

  public Player(PlayingType playingType) {
    this.playingType = playingType;
  }

  public Shape getChosenShape() {
    return PlayingType.ALWAYS_ROCK.equals(playingType)
        ? new Rock()
        : Shape.getRandomShape();
  }
}
