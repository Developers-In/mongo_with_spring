package lk.mongo_with_spring.asset.menu;

import lk.mongo_with_spring.asset.dish.Dish;
import lk.mongo_with_spring.asset.menu.enums.DishMenuStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class MenuDish {
  @Id
  private int id;

  private DishMenuStatus dishMenuStatus;

  private Dish dish;

  private Menu menu;
}
