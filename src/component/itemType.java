package component;

import java.util.List;

public class itemType {
  private List<String> type;
  
  public itemType() {
    type.add("Drinks");
    type.add("Brunch");
    type.add("Taiwanese food");
    type.add("Ameracan food");
    type.add("Japanese food");
    type.add("Fast food");
    /*------------------------*/
    type.add("Cloth");
    type.add("Shoes");
    type.add("3C");
    type.add("Book");
    type.add("Misc");
    /*
     type.add("");
     */
  }
  
  public List<String> getList(){
    return type;
  }
  
  public boolean isType(String compare) {
    for(String find: type) {
      if(compare.equals(find) == true) {
        return true;
      }
    }
    return false;
  }
  
  public void createNewType(String newtype) {
    if(isType(newtype) == false) {
      type.add(newtype);
    }
  }
  
  public void deleteType(String deletingtype) {
    for(int i = 0; i < type.size(); i++) {
      if(type.get(i).equals(deletingtype) == true) {
        type.remove(i--);
      }
    }
  }
}
