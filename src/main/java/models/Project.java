package models;

import lombok.Data;

@Data
public class Project {

  /** 成員 */
  private String member;

  /** Milestone */
  private String milestone;

  /** 名稱 */
  private String name;

  private Sprint sprint;

  public Project(String name, String milestone,String member) {
    this.member = member;
    this.milestone = milestone;
    this.name = name;
  }
}
