package component;

import java.util.ArrayList;
import java.util.List;

public class server extends CreateItem{
	String name = "";				//��server name
	
	ArrayList item_list = (ArrayList) super.items; //server �̭����ӫ~�M��
	
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
		observable.notifyObservers(item_list);	//���T�w�n���n���@�ӷs���M�� ��user�ק�
	}
	
	
	
	
	
}
