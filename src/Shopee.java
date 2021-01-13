import java.util.ArrayList;
import java.util.List;

import component.item;

public class Shopee extends AbstractShop{
	public List<item> GUIList = new ArrayList();
	
	public Shopee(ShopTypee SType) {
		super(SType);
		type(SType);
		transport(SType);
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


	public void transport(ShopTypee SType) {
		
		TPState = new String[6];
		TPState[0] = "檢貨中";
		TPState[1] = "包裹在物流中心，準備出貨";
		TPState[2] = "包裹開始配送";
		TPState[3] = "包裹到達地方物流中心";
		TPState[4] = "包裹投遞中";
		TPState[5] = "完成配送";
		
	}
}
