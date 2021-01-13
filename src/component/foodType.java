package component;

import java.util.ArrayList;
import java.util.List;

public class foodType extends itemType {
  private List<String> type = new ArrayList<>();
 
  public foodType() {
    type.add("Drinks");
    type.add("Brunch");
    type.add("Taiwanese food");
    type.add("Ameracan food");
    type.add("Japanese food");
    type.add("Fast food");
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
