package service;

import models.Member;

public interface IMemberSvc {

  public Member createMember(String name, String account, String password);

}
