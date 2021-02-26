package lk.mongo_with_spring.asset.publish_menu_restaurant_branch;

import lk.mongo_with_spring.asset.menu_restaurant.MenuRestaurant;
import lk.mongo_with_spring.asset.menu_restaurant_branch.MenuRestaurantBranch;
import lk.mongo_with_spring.asset.publish_menu_restaurant.enums.FallBackMenuStatus;
import lk.mongo_with_spring.asset.publish_menu_restaurant.enums.PublishFrequency;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class PublishMenuRestaurantBranch {
  @Id
  private int id;

  private LocalDateTime startDateAndTime, endDateAndTime;

  private PublishFrequency publishFrequency;

  private FallBackMenuStatus fallBackMenuStatus;

  private MenuRestaurantBranch menuRestaurantBranch;
}
