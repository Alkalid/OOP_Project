package component;

public class item {
	int price;
	String item_id;
	String name;
	itemType type;
	Shop shop;
	Seller seller;
	
	public item(int price, String item_id, String name, itemType type, Shop shop, Seller seller) {
		this.price = price;
		this.item_id = item_id;
		this.name = name;
		this.type = type;
		this.shop = shop;
		this.seller = seller;
	}
	
	public int getPrice() {
		return price;
	}


	public String getItem_id() {
		return item_id;
	}



	public String getName() {
		return name;
	}

	public itemType getType() {
		return this.type;
	}

	public void setType(itemType type) {
		this.type = type;
	}
	
	public Shop getShop() {
		return this.shop;
	}


	public Seller getSeller() {
		return this.seller;
	}

	
}
