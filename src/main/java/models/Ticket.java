package models;

import lombok.Data;

@Data
public class Ticket {

  /** 類型 */
  private String type;

  /** 父ticket */
  private String parentTicket;

  /** 劇情 */
  private String description;

  /** 工作標記 */
  private WorkMark workMark;

  /** UI */
  private UI ui;

  public Ticket(String type, String description, WorkMark workMark, UI ui) {
    this.type = type;
    this.description = description;
    this.workMark = workMark;
    this.ui = ui;
  }
}
