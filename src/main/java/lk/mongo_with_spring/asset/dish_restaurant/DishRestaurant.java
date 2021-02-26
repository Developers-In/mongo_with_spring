package lk.mongo_with_spring.asset.dish_restaurant;

import lk.mongo_with_spring.asset.dish.Dish;
import lk.mongo_with_spring.asset.dish_restaurant.enums.DishRestaurantStatus;
import lk.mongo_with_spring.asset.restaurant.Restaurant;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class DishRestaurant {
  @Id
  private int id;

  private DishRestaurantStatus dishRestaurantStatus;

  private Dish dish;

  private Restaurant restaurant;

  private List<DishRestaurant> dishRestaurants;

}
