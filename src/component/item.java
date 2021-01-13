package component;

public abstract class item {
	int price;
	String item_id;
	String name;
	itemType type;
	Shop shop;
	Seller seller;
	
	public item() {}
	
	public abstract void set();

	public abstract itemType getType();

	public abstract void setType(itemType type);
	
	public abstract Shop getShop();

	public abstract void setShop(Shop shop);

	public abstract Seller getSeller();

	public abstract void setSeller(Seller seller);
	
}
