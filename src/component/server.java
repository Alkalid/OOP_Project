package component;

import java.util.LinkedList;

public abstract class server {
	String name = "";				//此server name
	
	CreatItem CI = new CreatItem(); //包含
	
	
	LinkedList item_list = new LinkedList();	//server中有多少商品
	//item 陣列 表示此服務有多少項目
	
	public server() {
		CI.getItem;	//取得CreatItem 製造的物品 放進LinkedList陣列中
	}
	
	public abstract void transport();
	public abstract void type();
	
	public LinkedList getItemList() {
		return this.item_list;
	}
	
	public void NewItem(item item) {
		this.item_list.add(item);
	}
	
	public void select() {
		
	}
	
	public void Checkout() {
		
	}
	
	
	
}
