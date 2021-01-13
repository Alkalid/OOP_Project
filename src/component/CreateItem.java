package component;

public class CreateItem {
	item[] item = new item[30];

	public CreateItem() {
		super();
		item[0] = new item(25,"food_drink_a1","Coke",new foodType("Drinks"),new Shop("A"),null);
		item[1] = new item(50,"food_drink_a2","Boba Tea",new foodType("Drinks"),new Shop("A"),null);
		
		item[2] = new item(100,"food_brunch_b1","Omelet",new foodType("Brunch"),new Shop("B"),null);
		item[3] = new item(60,"food_brunch_b2","Sandwich",new foodType("Brunch"),new Shop("B"),null);
		
		item[4] = new item(150,"food_tw_c1","宮保雞丁",new foodType("Taiwanere food"),new Shop("C"),null);
		item[5] = new item(160,"food_tw_c2","蔥爆肉絲",new foodType("Taiwanere food"),new Shop("C"),null);
		
		item[6] = new item(120,"food_am_d1","Salad",new foodType("American food"),new Shop("D"),null);
		item[7] = new item(150,"food_am_d2","Spinach wrap",new foodType("American food"),new Shop("D"),null);
		
		item[8] = new item(200,"food_jp_e1","生魚片",new foodType("Japanese food"),new Shop("E"),null);
		item[9] = new item(150,"food_jp_e2","Sushi",new foodType("Japanese food"),new Shop("E"),null);
		item[10] = new item(250,"food_jp_h1","親子蓋飯",new foodType("Japanese food"),new Shop("H"),null);
		item[11] = new item(40,"food_jp_h2","茶碗蒸",new foodType("Japanese food"),new Shop("H"),null);
		
		item[12] = new item(100,"food_fast_f1","Hamburger",new foodType("Fast food"),new Shop("F"),null);
		item[13] = new item(70,"food_fast_f2","Fries",new foodType("Fast food"),new Shop("F"),null);
		item[14] = new item(150,"food_fast_g1","Fish & Chips",new foodType("Fast food"),new Shop("G"),null);
		item[15] = new item(160,"food_fast_g2","Hotdog and bun",new foodType("Fast food"),new Shop("G"),null);
		
		item[16] = new item(1000,"product_cloth_a1","黑色皮衣夾克",new productType("Shoes"),null,new Seller("a"));
		item[17] = new item(790,"product_cloth_a2","水洗牛仔褲",new productType("Shoes"),null,new Seller("a"));
		
		item[18] = new item(4500,"product_shoes_b1","Jordan 第8代",new productType("Cloth"),null,new Seller("b"));
		item[19] = new item(3400,"product_shoes_b2","Nike 氣墊鞋",new productType("Cloth"),null,new Seller("b"));
		
		item[20] = new item(44000,"product_3c_c1","Macbook Pro",new productType("3C"),null,new Seller("c"));
		item[21] = new item(27000,"product_3c_c2","Macbood air",new productType("3C"),null,new Seller("c"));
		item[22] = new item(90000,"product_3c_g1","Sony TV",new productType("3C"),null,new Seller("g"));
		item[23] = new item(88000,"product_3c_g2","LG TV",new productType("3C"),null,new Seller("g"));
		
		item[24] = new item(420,"product_book_d1","哈利波特",new productType("Book"),null,new Seller("d"));
		item[25] = new item(390,"product_book_d2","移動遊戲",new productType("Book"),null,new Seller("d"));
		
		item[26] = new item(380,"product_music_e1","Ed Sheeran",new productType("Music"),null,new Seller("e"));
		item[27] = new item(290,"product_music_e2","Rita Ora",new productType("Music"),null,new Seller("e"));
		item[28] = new item(300,"product_music_f1","Justin Bieber",new productType("Music"),null,new Seller("f"));
		item[29] = new item(250,"product_music_f2","Sam Smith",new productType("Music"),null,new Seller("f"));
		
		
		
		
	}
	
	
	
	
	
}
