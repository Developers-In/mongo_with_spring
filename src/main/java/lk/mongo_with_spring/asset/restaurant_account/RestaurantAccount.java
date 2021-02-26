package lk.mongo_with_spring.asset.restaurant_account;

import lk.mongo_with_spring.asset.dish.Dish;
import lk.mongo_with_spring.asset.menu.Menu;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
@Data
public class RestaurantAccount {
  @Id
  private int id;

  private String name;

  private LocalDate establishedAt;

  private List<RestaurantAccountRestaurant> restaurantAccountRestaurants;

  private List< Dish > dishes;

  private List< Menu > menus;

}
