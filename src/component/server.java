package component;

import java.util.LinkedList;

public abstract class server {
	String name = "";				//��server name
	
	CreatItem CI = new CreatItem(); //�]�t �ثeCreatItem�٨S���n
	
	//�ʶR��� �m�W �����ǪF�� �~�e�覡 �I�ڤ覡
	
	LinkedList item_list = new LinkedList();	//server�����h�ְӫ~
	//item �}�C ��ܦ��A�Ȧ��h�ֶ���
	
	public server() {
		CI.getItem;	//���oCreatItem �s�y�����~ ��iLinkedList�}�C��
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
