package lk.mongo_with_spring.asset.dish_restaurant_branch;

import lk.mongo_with_spring.asset.dish.Dish;
import lk.mongo_with_spring.asset.dish_restaurant.DishRestaurant;
import lk.mongo_with_spring.asset.dish_restaurant.enums.DishRestaurantStatus;
import lk.mongo_with_spring.asset.dish_restaurant_branch.enums.DishRestaurantBranchStatus;
import lk.mongo_with_spring.asset.restaurant.Restaurant;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class DishRestaurantBranch {
  @Id
  private int id;

  private DishRestaurantBranchStatus dishRestaurantBranchStatus;

private DishRestaurant dishRestaurant;
}
