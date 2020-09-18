package com.ronn.roshambo.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

  private final List<Round> rounds;

  public Game() {
    this.rounds = new ArrayList<>();
  }

  public List<Round> getRounds() {
    return rounds;
  }

  public void addRound(Round r) {
    this.rounds.add(r);
  }
}
