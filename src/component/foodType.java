package component;

import java.util.ArrayList;
import java.util.List;

public class foodType extends itemType {
private List<String> type = new ArrayList<>();
  
  public foodType() {
    super();
    type = super.getList();
  }

  public List<String> getList() {
    return type;
  }

  public boolean isType(String compare) {
    return super.isType(compare);
  }

  public void createNewType(String newtype) {
    super.createNewType(newtype);
  }

  public void deleteType(String deletingtype) {
    super.deleteType(deletingtype);
  }
}
