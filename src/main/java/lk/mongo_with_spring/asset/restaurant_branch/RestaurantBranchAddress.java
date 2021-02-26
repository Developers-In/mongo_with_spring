package lk.mongo_with_spring.asset.restaurant_branch;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class RestaurantBranchAddress {
  @Id
  private int id;

  private String streetAddress,city,state,zipCode,country;

  private RestaurantBranch restaurantBranch;
}
