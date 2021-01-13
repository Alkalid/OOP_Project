import java.util.ArrayList;
import java.util.LinkedList;

import component.*;

public abstract class AbstractShop {
	//ShopTypee SType = ShopTypee.FoodPanda;	//
	server DS = new server();  //瀏覽server裡的資料
	ArrayList ItemList = new ArrayList(); //表示商品清單
	String[] TPState;						//送貨進度
	
	
	public AbstractShop(ShopTypee SType) {	//根據type 決定購買品項
		//type(SType);	 // 在此實作ItemList
		//ransport(SType);//在此實作TPState
		
	}
	
	/*public void NewItem(item item) { //新增物品到商店 到時候再實作
		this.ItemList.add(item);
	}*/
	
	final public void select(item item) {
		System.out.println("選擇: " + item.getName());
	}
	
	final public void Checkout(ArrayList items) {
		int total = 0;
		System.out.println("購買品項: ");
		for(int i = 0; i < items.size(); i++) {
			item it = ((item)(items.get(i)));
			System.out.println("選擇: " + it.getName());
			total += it.getPrice();
		}
		System.out.println("----------------------------------");
		System.out.println("總金額"+ total);
	}
	
	
	
	public abstract void type(ShopTypee SType);
	public abstract void transport(ShopTypee SType);
	
}
