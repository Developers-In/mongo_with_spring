package lk.mongo_with_spring.asset.customer;

import lk.mongo_with_spring.asset.user_management.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Customer {
  @Id
  private int id;

  private String firstName, lastName, telephone, address;

  private List< User > users;
}
