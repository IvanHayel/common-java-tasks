package field.reflection.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Melon {
  String state;
  int weight;

  public void eat(@Ripe Melon this) {
  }
}
