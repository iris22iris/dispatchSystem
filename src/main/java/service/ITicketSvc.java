package service;

import models.Ticket;
import models.UI;
import models.WorkMark;

public interface ITicketSvc {

  public Ticket createTicket(String type, String description, WorkMark workMark, UI ui);

}
