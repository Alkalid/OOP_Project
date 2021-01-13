package component;

public abstract class item {
	int price;
	String item_id;
	String name;
	itemType type;
	shop shop;
	Seller seller;
	
	public item() {}
	
	public abstract void set();

	public abstract itemType getType();

	public abstract void setType(itemType type);
	
	public abstract shop getShop();

	public abstract void setShop(shop shop);

	public abstract Seller getSeller();

	public abstract void setSeller(Seller seller);
	
}
