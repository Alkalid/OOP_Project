package component;

import java.util.ArrayList;
import java.util.List;

public class productType extends itemType {
  private List<String> list = new ArrayList<String>();
  private String type = null;
  
  public productType(String type) {
	list.add("Cloth");
	list.add("Shoes");
	list.add("3C");
	list.add("Book");
	list.add("Music");
	if(isType(type)) {
    	this.type = type;
    }
  }
  	@Override
	public String getType() {
		return this.type;
	}


  
/* public boolean isType(String compare) {
    for(String find: list) {
      if(compare.equals(find) == true) {
        return true;
      }
    }
    return false;
  }*/
}
