package service.impl;

import models.Ticket;
import models.UI;
import models.WorkMark;
import org.springframework.stereotype.Service;
import service.ITicketSvc;

@Service
public class TicketSvcImpl implements ITicketSvc {

  @Override
  public Ticket createTicket(String type, String description, WorkMark workMark, UI ui) {
    return new Ticket(type,description,workMark,ui);
  }
}
