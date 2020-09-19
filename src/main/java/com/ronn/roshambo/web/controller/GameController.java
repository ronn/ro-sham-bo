package com.ronn.roshambo.web.controller;

import com.ronn.roshambo.dto.ResultDTO;
import com.ronn.roshambo.model.Game;
import com.ronn.roshambo.service.GameService;
import com.ronn.roshambo.web.GameRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

  @Autowired
  GameService gameService;

  //@PostMapping("/round")
  @GetMapping("/round")
  public ResponseEntity<Game> playRound(){
    Game game = gameService.playRound();

    return new ResponseEntity<>(game, HttpStatus.OK);
  }

  @GetMapping("/games")
  public ResponseEntity<GameRecord> getGamesTotal(){
     return new ResponseEntity<>(gameService.getResults(), HttpStatus.OK);
  }
}
