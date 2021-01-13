package component;

import java.util.ArrayList;
import java.util.List;

public class foodType extends itemType {
	private List<String> list = new ArrayList<String>();
	private String type = null;

	public foodType(String type) {
		list.add("Drinks");
		list.add("Brunch");
		list.add("Taiwanese food");
		list.add("Ameracan food");
		list.add("Japanese food");
		list.add("Fast food");
		if (isType(type)) {
			this.type = type;
		}
	}
	
	@Override
	public String getType() {
		return this.type;
	}
	/*public boolean isType(String compare) {
	    for(String find: list) {
	      if(compare.equals(find) == true) {
	        return true;
	      }
	    }
	    return false;
	}*/

}
