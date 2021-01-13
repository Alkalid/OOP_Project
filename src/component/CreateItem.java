package component;

import java.util.ArrayList;
import java.util.List;

public class CreateItem {
	List<item> items = new ArrayList();
	
	public CreateItem() {
		items.add(new item(25,"food_drink_a1","Coke",new foodType("Drinks"),new Shop("A"),null)) ;
		items.add(new item(50,"food_drink_a2","Boba Tea",new foodType("Drinks"),new Shop("A"),null));
		
		items.add(new item(100,"food_brunch_b1","Omelet",new foodType("Brunch"),new Shop("B"),null));
		items.add(new item(60,"food_brunch_b2","Sandwich",new foodType("Brunch"),new Shop("B"),null));
		
		items.add(new item(150,"food_tw_c1","宮保雞丁",new foodType("Taiwanere food"),new Shop("C"),null));
		items.add(new item(160,"food_tw_c2","蔥爆肉絲",new foodType("Taiwanere food"),new Shop("C"),null));
		
		items.add(new item(120,"food_am_d1","Salad",new foodType("American food"),new Shop("D"),null));
		items.add(new item(150,"food_am_d2","Spinach wrap",new foodType("American food"),new Shop("D"),null));
		
		items.add(new item(200,"food_jp_e1","生魚片",new foodType("Japanese food"),new Shop("E"),null));
		items.add(new item(150,"food_jp_e2","Sushi",new foodType("Japanese food"),new Shop("E"),null));
		items.add(new item(250,"food_jp_h1","親子蓋飯",new foodType("Japanese food"),new Shop("H"),null));
		items.add(new item(40,"food_jp_h2","茶碗蒸",new foodType("Japanese food"),new Shop("H"),null));
		
		items.add(new item(100,"food_fast_f1","Hamburger",new foodType("Fast food"),new Shop("F"),null));
		items.add( new item(70,"food_fast_f2","Fries",new foodType("Fast food"),new Shop("F"),null));
		items.add(new item(150,"food_fast_g1","Fish & Chips",new foodType("Fast food"),new Shop("G"),null));
		items.add( new item(160,"food_fast_g2","Hotdog and bun",new foodType("Fast food"),new Shop("G"),null));
		
		items.add(new item(1000,"product_cloth_a1","黑色皮衣夾克",new productType("Shoes"),null,new Seller("a")));
		items.add( new item(790,"product_cloth_a2","水洗牛仔褲",new productType("Shoes"),null,new Seller("a")));
		
		items.add(new item(4500,"product_shoes_b1","Jordan 第8代",new productType("Cloth"),null,new Seller("b")));
		items.add( new item(3400,"product_shoes_b2","Nike 氣墊鞋",new productType("Cloth"),null,new Seller("b")));
		
		items.add( new item(44000,"product_3c_c1","Macbook Pro",new productType("3C"),null,new Seller("c")));
		items.add( new item(27000,"product_3c_c2","Macbood air",new productType("3C"),null,new Seller("c")));
		items.add( new item(90000,"product_3c_g1","Sony TV",new productType("3C"),null,new Seller("g")));
		items.add( new item(88000,"product_3c_g2","LG TV",new productType("3C"),null,new Seller("g")));
		
		items.add( new item(420,"product_book_d1","哈利波特",new productType("Book"),null,new Seller("d")));
		items.add( new item(390,"product_book_d2","移動遊戲",new productType("Book"),null,new Seller("d")));
		
		items.add(new item(380,"product_music_e1","Ed Sheeran",new productType("Music"),null,new Seller("e")));
		items.add(new item(290,"product_music_e2","Rita Ora",new productType("Music"),null,new Seller("e")));
		items.add(new item(300,"product_music_f1","Justin Bieber",new productType("Music"),null,new Seller("f")));
		items.add(new item(250,"product_music_f2","Sam Smith",new productType("Music"),null,new Seller("f")));
	}
	
	
	public List<item> getItemList() {
		return this.items;
	}
	
	
}
