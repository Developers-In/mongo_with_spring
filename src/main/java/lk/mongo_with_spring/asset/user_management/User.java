package lk.mongo_with_spring.asset.user_management;

import lk.mongo_with_spring.asset.customer.Customer;
import lk.mongo_with_spring.asset.employee.Employee;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class User {
  @Id
  private int id;
  private String username;
  private String password;
  private boolean status;

  private Employee employee;

  private Customer  customer;

  private List< Role > roles;

  private List<UserSessionManger> userSessionMangers;

}
