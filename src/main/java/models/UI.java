package models;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UI { 

  /** 圖片 */
  private String image;

  /** 建立時間 */
  private LocalDateTime createTime;
}
