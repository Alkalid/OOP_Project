import java.util.ArrayList;
import java.util.LinkedList;

import component.*;

public abstract class AbstractShop {
	//ShopTypee SType = ShopTypee.FoodPanda;	//
	server DS = new server();  //�s��server�̪����
	ArrayList ItemList = new ArrayList(); //��ܰӫ~�M��
	String[] TPState;						//�e�f�i��
	
	
	public AbstractShop(ShopTypee SType) {	//�ھ�type �M�w�ʶR�~��
		type(SType);	 // �b����@ItemList
		transport(SType);//�b����@TPState
		
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
	
	public void transport(ShopTypee SType) {
		if(SType ==  ShopTypee.FoodPanda) {
			TPState = new String[4];
			TPState[0] = "�~�e�����b�e�����\";
			TPState[1] = "�~�e�����b�e���z���a�}";
			TPState[2] = "�~�e���Y�N��F";
			TPState[3] = "�����e�\";
		}
	}
	
	public void type(ShopTypee SType) {
		ArrayList allItem = DS.getItemList(); //�d��DataServer ���o�ӫ~�M�� �Ӧ�Server
		
		if(SType ==  ShopTypee.FoodPanda) {
			for(int i = 0; i < allItem.size(); i++ ) {	//����
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
			for(int i = 0; i < allItem.size(); i++ ) {	//����
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
