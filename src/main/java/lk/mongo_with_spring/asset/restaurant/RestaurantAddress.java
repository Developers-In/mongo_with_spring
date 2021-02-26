package lk.mongo_with_spring.asset.restaurant;

import lk.mongo_with_spring.asset.review.enums.Rating;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class RestaurantAddress {
  @Id
  private int id;

  private String streetAddress,city,state,zipCode,country;

  private Restaurant restaurant;
}
