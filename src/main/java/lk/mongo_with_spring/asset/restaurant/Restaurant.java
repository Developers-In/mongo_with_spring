package lk.mongo_with_spring.asset.restaurant;

import lk.mongo_with_spring.asset.dish_restaurant.DishRestaurant;
import lk.mongo_with_spring.asset.restaurant_account.RestaurantAccountRestaurant;
import lk.mongo_with_spring.asset.user_management.Employee;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
@Data
public class Restaurant {
  @Id
  private int id;

  private String name,telephone,website;

  private LocalDate establishedAt;

  private RestaurantAddress restaurantAddress;

  private List<BusinessHours> businessHours;

  private List< RestaurantAccountRestaurant > restaurantAccountRestaurants;

  private List< Employee > employees;

  private List< DishRestaurant > dishRestaurants;
}
