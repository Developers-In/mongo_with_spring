package lk.mongo_with_spring.asset.employee;

import lk.mongo_with_spring.asset.restaurant.Restaurant;
import lk.mongo_with_spring.asset.user_management.User;
import lk.mongo_with_spring.asset.restaurant_branch.RestaurantBranch;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Employee {
  @Id
  private int id;

  private String firstName, lastName;

  private Restaurant restaurant;

  private RestaurantBranch restaurantBranch;

  private List< User > users;

}
