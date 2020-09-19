package com.ronn.roshambo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ResultDTO {

  private String result;

  public ResultDTO() {
  }

  public ResultDTO(String result) {
    this.result = result;
  }

  @GeneratedValue
  private String id;

  public void setId(String id) {
    this.id = id;
  }

  @Id
  public String getId() {
    return id;
  }
}
