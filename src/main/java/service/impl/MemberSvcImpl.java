package service.impl;

import models.Member;
import org.springframework.stereotype.Service;
import service.IMemberSvc;

@Service
public class MemberSvcImpl implements IMemberSvc {

  @Override
  public Member createMember(String name, String account, String password) {
    return new Member(name,account,password);
  }
}
