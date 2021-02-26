package lk.mongo_with_spring.asset.restaurant_branch;

import lk.mongo_with_spring.asset.user_management.Employee;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document
public class RestaurantBranch {
  @Id
  private int id;

  private String name,telephone,website;

  private LocalDate establishedAt;

  private RestaurantBranchAddress restaurantBranchAddress;

  private List< Employee > employees;

}
