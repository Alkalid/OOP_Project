import java.util.LinkedList;

import component.*;

public abstract class AbstractShop extends AllFunction{
	//ShopTypee SType = ShopTypee.FoodPanda;	//
	server DS;  //瀏覽server裡的資料
	LinkedList ItemList = new LinkedList(); //表示商品清單
	String[] TPState;						//送貨進度
	
	
	public AbstractShop(ShopTypee SType) {	//根據type 決定購買品項
		type(SType);	 // 在此實作ItemList
		transport(SType);//在此實作TPState
		
	}
	
	public void select() {
		
	}
	
	public void Checkout() {
		
	}
	
	public void NewItem(item item) { //新增物品到商店 到時候再實作
		this.ItemList.add(item);
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
		if(SType ==  ShopTypee.FoodPanda) {
			LinkedList allItem = DS.getItemList(); //查看 取得商品清單 來自Server
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
	}
	
	
}
