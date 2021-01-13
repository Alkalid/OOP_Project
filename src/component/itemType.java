package component;

import java.util.List;

public class itemType {
	private List<String> list;

	public itemType() {
		list.add("Drinks");
		list.add("Brunch");
		list.add("Taiwanese food");
		list.add("Ameracan food");
		list.add("Japanese food");
		list.add("Fast food");
		/*------------------------*/
		list.add("Cloth");
		list.add("Shoes");
		list.add("3C");
		list.add("Book");
		list.add("Misc");
		/*
		 * type.add("");
		 */
	}

	public List<String> getList() {
		return list;
	}

	public boolean isType(String compare) {
		for (String find : list) {
			if (compare.equals(find) == true) {
				return true;
			}
		}
		return false;
	}

	public void createNewType(String newtype) {
		if (isType(newtype) == false) {
			list.add(newtype);
		}
	}

	public void deleteType(String deletingtype) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(deletingtype) == true) {
				list.remove(i--);
			}
		}
	}
}
