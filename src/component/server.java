package component;

import java.util.LinkedList;

public abstract class server {
	String name = "";				//��server name
	
	CreatItem CI = new CreatItem(); //�]�t
	
	
	LinkedList item_list = new LinkedList();	//server�����h�ְӫ~
	//item �}�C ��ܦ��A�Ȧ��h�ֶ���
	
	public server() {
		CI.getItem;	//���oCreatItem �s�y�����~ ��iLinkedList�}�C��
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
