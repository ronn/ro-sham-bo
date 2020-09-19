package com.ronn.roshambo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResultDTO {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  private String id;

  private String result;

  public ResultDTO() {
  }

  public ResultDTO(String result) {
    this.result = result;
  }

  public void setId(String id) {
    this.id = id;
  }

  @JsonIgnore
  public String getId() {
    return id;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
