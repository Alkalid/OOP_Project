import java.util.ArrayList;
import java.util.LinkedList;

import component.*;

public abstract class AbstractShop {
	//ShopTypee SType = ShopTypee.FoodPanda;	//
	server DS = new server();  //�s��server�̪����
	ArrayList ItemList = new ArrayList(); //��ܰӫ~�M��
	String[] TPState;						//�e�f�i��
	
	
	public AbstractShop(ShopTypee SType) {	//�ھ�type �M�w�ʶR�~��
		//type(SType);	 // �b����@ItemList
		//ransport(SType);//�b����@TPState
		
	}
	
	/*public void NewItem(item item) { //�s�W���~��ө� ��ɭԦA��@
		this.ItemList.add(item);
	}*/
	
	final public void select(item item) {
		System.out.println("���: " + item.getName());
	}
	
	final public void Checkout(ArrayList items) {
		int total = 0;
		System.out.println("�ʶR�~��: ");
		for(int i = 0; i < items.size(); i++) {
			item it = ((item)(items.get(i)));
			System.out.println("���: " + it.getName());
			total += it.getPrice();
		}
		System.out.println("----------------------------------");
		System.out.println("�`���B"+ total);
	}
	
	
	
	public abstract void type(ShopTypee SType);
	public abstract void transport(ShopTypee SType);
	
}
