package com.ronn.roshambo.service;

import com.ronn.roshambo.model.Game;
import com.ronn.roshambo.model.RoundResult;
import com.ronn.roshambo.model.shape.Rock;
import org.junit.jupiter.api.Test;

import static com.ronn.roshambo.model.RoundResult.DRAW;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    RoundResult roundResult = gameService.defineResult(new Rock(), new Rock());
    assertEquals(DRAW, roundResult);
  }
}
