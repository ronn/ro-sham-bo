package com.ronn.roshambo.web;

public class GameRecord {

  private Integer totalRounds;
  private Long winsPlayer1;
  private Long winsPlayer2;
  private Long draws;

  public GameRecord() {
  }

  public GameRecord(Integer totalRounds, Long winsPlayer1, Long winsPlayer2, Long draws) {
    this.totalRounds = totalRounds;
    this.winsPlayer1 = winsPlayer1;
    this.winsPlayer2 = winsPlayer2;
    this.draws = draws;
  }

  public Integer getTotalRounds() {
    return totalRounds;
  }

  public void setTotalRounds(Integer totalRounds) {
    this.totalRounds = totalRounds;
  }

  public Long getWinsPlayer1() {
    return winsPlayer1;
  }

  public void setWinsPlayer1(Long winsPlayer1) {
    this.winsPlayer1 = winsPlayer1;
  }

  public Long getWinsPlayer2() {
    return winsPlayer2;
  }

  public void setWinsPlayer2(Long winsPlayer2) {
    this.winsPlayer2 = winsPlayer2;
  }

  public Long getDraws() {
    return draws;
  }

  public void setDraws(Long draws) {
    this.draws = draws;
  }
}
