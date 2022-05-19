package service.impl;

import models.Member;
import models.Project;
import org.springframework.stereotype.Service;
import service.IProjectSvc;

@Service
public class ProjectSvcImpl implements IProjectSvc {

  @Override
  public Project createProject(String name,String milestone,Member member) {
    return new Project(name,milestone,member.getAccount());
  }
}
