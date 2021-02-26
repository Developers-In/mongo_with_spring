package lk.mongo_with_spring.asset.menu_restaurant_branch;

import lk.mongo_with_spring.asset.menu_restaurant.MenuRestaurant;
import lk.mongo_with_spring.asset.menu_restaurant_branch.enums.MenuRestaurantBranchStatus;
import lk.mongo_with_spring.asset.publish_menu_restaurant_branch.PublishMenuRestaurantBranch;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class MenuRestaurantBranch {
  @Id
  private int id;

  private MenuRestaurantBranchStatus menuRestaurantBranchStatus;

  private MenuRestaurant menuRestaurant;

  private List<PublishMenuRestaurantBranch> publishMenuRestaurantBranches;

}
