package component;

import java.util.LinkedList;

public abstract class server {
	String name = "";				//��server name
	
	CreateItem CI = new CreateItem(); //�]�t �ثeCreatItem�٨S���n
	
	//�ʶR��� �m�W �����ǪF�� �~�e�覡 �I�ڤ覡
	
	LinkedList item_list = new LinkedList();	//server�����h�ְӫ~
	//item �}�C ��ܦ��A�Ȧ��h�ֶ���
	
	public server() {
		item[] items= CI.getItemList();	//���oCreatItem �s�y�����~ ��iLinkedList�}�C��
		for(int i = 0; i < items.length; i++)
		{
			item_list.add(items[i]);
		}
	}
	
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
	
	public abstract void transport();
	public abstract void type();
	
}
