package com.ronn.roshambo.service;

import com.ronn.roshambo.model.*;
import org.junit.jupiter.api.Test;

import static com.ronn.roshambo.model.RoundResult.DRAW;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

class GameServiceTest {

  @Test
  void playRound() {
    GameService gameService = new GameService();
    Player player1 = new Player(PlayingType.RANDOM);
    Player player2 = new Player(PlayingType.RANDOM);

    Round round = new Round(player1, player2);

    Game game = gameService.playRound(round);
    assertEquals(1, game.getRounds().size());

    gameService.playRound(round);
    assertEquals(2, game.getRounds().size());
  }

  @Test
  void defineResult() {
    GameService gameService = new GameService();

    RoundResult roundResult = gameService.defineResult(new Player(PlayingType.ALWAYS_ROCK), new Player(PlayingType.ALWAYS_ROCK));
    assertEquals(DRAW, roundResult);
  }
}
