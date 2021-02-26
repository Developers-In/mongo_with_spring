package lk.mongo_with_spring.asset.restaurant_account;

import lk.mongo_with_spring.asset.restaurant.Restaurant;
import lk.mongo_with_spring.asset.restaurant_account.enums.RestaurantAccountStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class RestaurantAccountRestaurant {
  @Id
  private int id;

  private RestaurantAccountStatus restaurantAccountStatus;

  private Restaurant restaurants;

  private RestaurantAccount restaurantAccount;
}
