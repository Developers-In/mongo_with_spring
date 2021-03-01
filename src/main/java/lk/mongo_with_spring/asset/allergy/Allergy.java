package lk.mongo_with_spring.asset.allergy;

import lk.mongo_with_spring.asset.allergy.enums.AllergyCategory;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Allergy {
  @Id
  private int id;

  private String name;

  private AllergyCategory allergyCategory;

}
