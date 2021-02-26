package lk.mongo_with_spring.asset.user_management;

import lk.mongo_with_spring.asset.user_management.enums.LoginStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class UserSessionManger {
@Id
  private int id;
private LocalDateTime logOrOutTime;

private LoginStatus loginStatus;

private User user;
}
