package lk.mongo_with_spring.asset.restaurant;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;

@Document
@Data
public class BusinessHours {
  @Id
  private int id;
  private LocalTime startAt, closeAt;

  private Restaurant restaurant;
}
