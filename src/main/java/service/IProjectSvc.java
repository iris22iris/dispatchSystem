package service;

import models.Member;
import models.Project;

public interface IProjectSvc {

  public Project createProject(String name,String milestone, Member memberAccount);

}
