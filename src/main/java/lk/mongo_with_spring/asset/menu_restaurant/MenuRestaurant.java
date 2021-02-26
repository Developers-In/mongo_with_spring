package lk.mongo_with_spring.asset.menu_restaurant;

import lk.mongo_with_spring.asset.menu.Menu;
import lk.mongo_with_spring.asset.menu_restaurant.enums.MenuRestaurantStatus;
import lk.mongo_with_spring.asset.publish_menu_restaurant.PublishMenuRestaurant;
import lk.mongo_with_spring.asset.restaurant.Restaurant;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class MenuRestaurant {
  @Id
  private int id;

  private MenuRestaurantStatus menuRestaurantStatus;

  private Menu menu;

  private Restaurant restaurant;

  private List< MenuRestaurant > dishRestaurants;

  private List< PublishMenuRestaurant > publishMenuRestaurants;

}
