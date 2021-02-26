package lk.mongo_with_spring.asset.publish_menu_restaurant;


import jdk.jfr.Frequency;
import lk.mongo_with_spring.asset.menu_restaurant.MenuRestaurant;
import lk.mongo_with_spring.asset.publish_menu_restaurant.enums.FallBackMenuStatus;
import lk.mongo_with_spring.asset.publish_menu_restaurant.enums.PublishFrequency;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class PublishMenuRestaurant {
  @Id
  private int id;

  private LocalDateTime startDateAndTime, endDateAndTime;

  private PublishFrequency publishFrequency;

  private FallBackMenuStatus fallBackMenuStatus;

  private MenuRestaurant menuRestaurant;

}
