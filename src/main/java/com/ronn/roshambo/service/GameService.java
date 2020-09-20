package com.ronn.roshambo.service;

import com.ronn.roshambo.dto.ResultDTO;
import com.ronn.roshambo.model.*;
import com.ronn.roshambo.model.shape.Rock;
import com.ronn.roshambo.repository.GameRepository;
import com.ronn.roshambo.web.GameRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.ronn.roshambo.model.RoundResult.*;

@Service
public class GameService {

  Game game = new Game();

  @Autowired
  GameRepository resultRepository;

  public Game playRound() {
    Shape chosenShape1 = Shape.getRandomShape();
    Shape chosenShape2 = new Rock();

    Player player1 = new Player(chosenShape1.getName());
    Player player2 = new Player(chosenShape2.getName());

    RoundResult roundResult = defineResult(chosenShape1, chosenShape2);

    Round round = new Round(player1, player2, roundResult);

    ResultDTO save = resultRepository.save(new ResultDTO(roundResult.name()));
    game.addRound(round);

    return game;
  }

  public GameRecord getResults(){
    List<ResultDTO> all = resultRepository.findAll();

    long draws = filterResult(all, DRAW);

    long p1Wins = filterResult(all, PLAYER_1);

    long p2Wins = filterResult(all, PLAYER_2);

    return new GameRecord(all.size(), p1Wins, p2Wins, draws);
  }

  private long filterResult(List<ResultDTO> all, RoundResult desiredResult) {
    return all.stream()
        .filter(r -> desiredResult.name().equals(r.getResult()))
        .count();
  }

  public RoundResult defineResult(Shape chosenShape1, Shape chosenShape2) {
    if (chosenShape1.getClass().equals(chosenShape2.getClass())) {
      return DRAW;
    }

    return chosenShape1.beats(chosenShape2)
        ? PLAYER_1
        : PLAYER_2;
  }

  public Game restartGame() {
    game = new Game();
    return game;
  }
}
