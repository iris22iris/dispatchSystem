package models;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class WorkMark {

  /** 類型 */
  private String type;

  /** 完成時間 */
  private LocalDateTime completeTime;

  /** 標記狀態 */
  private String status;

}
