package lk.mongo_with_spring.asset.allergy;

import lk.mongo_with_spring.asset.allergy.enums.AllergyCategory;
import lk.mongo_with_spring.asset.customer.Customer;
import lk.mongo_with_spring.asset.ingredient.Ingredient;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Allergy {
  @Id
  private int id;

  private String name;

  private AllergyCategory allergyCategory;

  private List< Customer > customers;

  private List< Ingredient > ingredients;
}
