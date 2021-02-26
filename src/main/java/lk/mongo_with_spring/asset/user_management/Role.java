package lk.mongo_with_spring.asset.user_management;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Role {
@Id
  private int id;
private String name;

private List<User> users;
}
