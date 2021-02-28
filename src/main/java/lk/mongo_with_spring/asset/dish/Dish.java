package lk.mongo_with_spring.asset.dish;

import lk.mongo_with_spring.asset.dish.enums.Format;
import lk.mongo_with_spring.asset.ingredient.Ingredient;
import lk.mongo_with_spring.asset.restaurant_account.RestaurantAccount;
import lk.mongo_with_spring.asset.review.Review;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document
@Data
public class Dish {
  @Id
  private int id;

  private String name,description;

  private BigDecimal price;
//todo-> need to more clarification about this
  private Format format;

  private RestaurantAccount restaurantAccount;

  private List<Review> reviews;

  private List< Ingredient > ingredients;

}
