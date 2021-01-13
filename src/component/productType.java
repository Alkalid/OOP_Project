package component;

import java.util.ArrayList;
import java.util.List;

public class productType extends itemType {
  List<String> type = new ArrayList<>();
  
  public productType() {
    type.add("Cloth");
    type.add("Shoes");
    type.add("3C");
    type.add("Book");
    type.add("Misc");
  }
}
