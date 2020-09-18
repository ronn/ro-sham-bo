package com.ronn.roshambo.service;

import com.ronn.roshambo.model.*;

import static com.ronn.roshambo.model.RoundResult.*;

public class GameService {

  Game game = new Game();

  public Game playRound(Round round) {
    round.setResult(defineResult(round.getPlayer1(), round.getPlayer2()));
    game.addRound(round);

    return game;
  }

  public RoundResult defineResult(Player p1, Player p2) {
    Shape chosenShape1 = p1.getChosenShape();
    Shape chosenShape2 = p2.getChosenShape();

    if (chosenShape1.getClass().equals(chosenShape2.getClass())) {
      return DRAW;
    }

    return chosenShape1.beats(chosenShape2)
        ? PLAYER_1
        : PLAYER_2;
  }

  public Game restartGame() {
    game.getRounds().clear();
    System.gc();
    return null;
  }
}
