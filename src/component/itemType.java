package component;

import java.util.List;

public abstract class itemType {
  private List<String> type;
  
  public boolean isType(String compare) {
    for(String find: type) {
      if(compare.equals(find) == true) {
        return true;
      }
    }
    return false;
  }
}
