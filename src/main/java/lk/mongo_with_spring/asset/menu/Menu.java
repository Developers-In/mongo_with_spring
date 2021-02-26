package lk.mongo_with_spring.asset.menu;

import lk.mongo_with_spring.asset.category.Category;
import lk.mongo_with_spring.asset.restaurant_account.RestaurantAccount;
import lk.mongo_with_spring.asset.section.Section;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Menu {
  @Id
  private int id;

  private String name;

  private RestaurantAccount restaurantAccount;

  private Category category;

  private Section section;

}
