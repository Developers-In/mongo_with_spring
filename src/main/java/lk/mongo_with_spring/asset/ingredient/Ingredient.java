package lk.mongo_with_spring.asset.ingredient;

import lk.mongo_with_spring.asset.dish.Dish;
import lk.mongo_with_spring.asset.allergy.enums.AllergyCategory;
import lk.mongo_with_spring.asset.ingredient.enums.MeasuringUnit;
import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Ingredient {
  @Id
  private int id;

  private String name;

  private String quantity;

  private MeasuringUnit measuringUnit;

  private AllergyCategory allergyCategory;

  private Binary image;

  private Dish dish;
}
