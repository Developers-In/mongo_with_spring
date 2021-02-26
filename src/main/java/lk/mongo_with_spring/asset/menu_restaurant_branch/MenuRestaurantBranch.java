package lk.mongo_with_spring.asset.menu_restaurant_branch;

import lk.mongo_with_spring.asset.menu_restaurant.MenuRestaurant;
import lk.mongo_with_spring.asset.menu_restaurant_branch.enums.MenuRestaurantBranchStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class MenuRestaurantBranch {
  @Id
  private int id;

  private MenuRestaurantBranchStatus menuRestaurantBranchStatus;

private MenuRestaurant menuRestaurant;
}
