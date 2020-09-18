package com.ronn.roshambo.service;

import com.ronn.roshambo.model.*;
import org.junit.jupiter.api.Test;

import static com.ronn.roshambo.model.RoundResult.DRAW;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

class GameServiceTest {

  @Test
  void when_calling_playRound_new_round_is_added_to_current_game() {
    GameService gameService = new GameService();

    Game game = gameService.playRound();
    assertEquals(1, game.getRounds().size());

    gameService.playRound();
    assertEquals(2, game.getRounds().size());
  }

  @Test
  void when_same_shape_is_chosen_then_result_is_draw() {
    GameService gameService = new GameService();

    RoundResult roundResult = gameService.defineResult(new Player(PlayingType.ALWAYS_ROCK), new Player(PlayingType.ALWAYS_ROCK));
    assertEquals(DRAW, roundResult);
  }
}
