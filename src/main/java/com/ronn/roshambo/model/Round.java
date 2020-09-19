package com.ronn.roshambo.model;

public class Round {

  private final Player player1;
  private final Player player2;
  private final RoundResult result;

  public Round(Player player1, Player player2, RoundResult roundResult) {
    this.player1 = player1;
    this.player2 = player2;
    this.result = roundResult;
  }

  public Player getPlayer1() {
    return player1;
  }

  public Player getPlayer2() {
    return player2;
  }

  public RoundResult getResult() {
    return result;
  }
}
