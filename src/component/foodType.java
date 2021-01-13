package component;

import java.util.ArrayList;
import java.util.List;

public class foodType extends itemType {
  List<String> type = new ArrayList<>();
  
  public foodType() {
    type.add("Drinks");
    type.add("Brunch");
    type.add("Taiwanese food");
    type.add("Ameracan food");
    type.add("Japanese food");
    type.add("Fast food");
    type.add("");
  }
}
