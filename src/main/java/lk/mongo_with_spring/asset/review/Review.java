package lk.mongo_with_spring.asset.review;

import lk.mongo_with_spring.asset.dish.Dish;
import lk.mongo_with_spring.asset.review.enums.Rating;
import lk.mongo_with_spring.asset.user_management.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Review {
  @Id
  private int id;

  private String comment;

  private Rating rating;

  private Dish dish;

  private List< User > users;
}
