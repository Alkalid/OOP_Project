package component;

import java.util.ArrayList;
import java.util.List;

public class server extends CreateItem{
	String name = "";				//此server name
	
	ArrayList item_list = (ArrayList) super.items; //server 裡面的商品清單
	
	private DelegatedOBS observable;
	
	
	public server() {
		observable = new DelegatedOBS();
		
	}
	
	public ArrayList getItemList() {
		return item_list;
	}
	
	public void  newItem(item item) {
		item_list.add(item);
		observable.setChanged();
		observable.notifyObservers(item_list);	//不確定要不要給一個新的清單 怕user修改
	}
	
	
	
	
	
}
