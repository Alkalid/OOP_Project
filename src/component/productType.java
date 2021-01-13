package component;

import java.util.ArrayList;
import java.util.List;

public class productType extends itemType {
  private List<String> type = new ArrayList<>();
  
  public productType() {
    type.add("Cloth");
    type.add("Shoes");
    type.add("3C");
    type.add("Book");
    type.add("Misc");
    //type.add("");
  }
  
  public boolean isType(String compare) {
    for(String find: type) {
      if(compare.equals(find) == true) {
        return true;
      }
    }
    return false;
  }
}
