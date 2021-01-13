import java.util.ArrayList;
import java.util.LinkedList;

import component.*;

public abstract class AbstractShop {
	//ShopTypee SType = ShopTypee.FoodPanda;	//
	server DS = new server();  //瀏覽server裡的資料
	ArrayList ItemList = new ArrayList(); //表示商品清單
	String[] TPState;						//送貨進度
	
	
	public AbstractShop(ShopTypee SType) {	//根據type 決定購買品項
		type(SType);	 // 在此實作ItemList
		transport(SType);//在此實作TPState
		
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
	
	public void transport(ShopTypee SType) {
		if(SType ==  ShopTypee.FoodPanda) {
			TPState = new String[4];
			TPState[0] = "外送員正在前往取餐";
			TPState[1] = "外送員正在前往您的地址";
			TPState[2] = "外送員即將抵達";
			TPState[3] = "完成送餐";
		}
	}
	
	public void type(ShopTypee SType) {
		ArrayList allItem = DS.getItemList(); //查看DataServer 取得商品清單 來自Server
		
		if(SType ==  ShopTypee.FoodPanda) {
			for(int i = 0; i < allItem.size(); i++ ) {	//分類
				String allItem_type = ((item)(allItem.get(i))).getType();
				
				if (allItem_type == "Drinks") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "Brunch") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "Taiwanese food") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "Ameracan food") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "Japanese food") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "Fast food") { 
					this.ItemList.add(allItem.get(i));
				}
			}
			
		}
		
		if(SType ==  ShopTypee.Shopee) {
			for(int i = 0; i < allItem.size(); i++ ) {	//分類
				String allItem_type = ((item)(allItem.get(i))).getType();
				
				if (allItem_type == "Drinks") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "Taiwanese food") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "Book") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "3C") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "Cloth") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "Shoes") { 
					this.ItemList.add(allItem.get(i));
				}
				else if (allItem_type == "Misc") { 
					this.ItemList.add(allItem.get(i));
				}
			}
		}
	}
	
	
}
