package lk.mongo_with_spring.asset.section;

import lk.mongo_with_spring.asset.menu.Menu;
import lk.mongo_with_spring.asset.restaurant.Restaurant;
import lk.mongo_with_spring.asset.review.Review;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Section {
  @Id
  private int id;
  //todo -> need to more clarification about order
  private String name,order;

  private List< Menu > menus;
}
