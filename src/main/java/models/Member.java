package models;

import lombok.Data;

@Data
public class Member {

  /** 名字 */
  private String name;

  /** 帳號 */
  private String account;

  /** 密碼 */
  private String password;

  public Member(String name, String account, String password) {
    this.name = name;
    this.account = account;
    this.password = password;
  }

}
