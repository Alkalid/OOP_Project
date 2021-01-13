import component.*;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GUI_Shopee {
  List<item> itemList = new ArrayList<>();
  List<String> typeList = new ArrayList<>();
  
    public GUI_Shopee() {
      CreateItem createItem = new CreateItem();
      itemType itemtype = new itemType();
      itemList = createItem.getItemList();
      typeList = itemtype.getList();
      new MyFrame(typeList,itemList);
    }
    
    public GUI_Shopee(List<String> type,List<item> items) {
      typeList = type;
      itemList = items;
      new MyFrame(typeList,itemList);
    }
    
    public static void main(String[] args) {
     CreateItem createItem = new CreateItem();
     itemType itemtype = new itemType();
        List<item> itemList = new ArrayList<>();
        Shopee SP = new Shopee(ShopTypee.Shopee);
        itemList = SP.ItemList;
        //itemList = createItem.getItemList();
        List<String> typeList = new ArrayList<>();
        typeList = itemtype.getList();
        new MyFrame_Shopee(typeList,itemList);
    }
}

class MyFrame_Shopee extends JFrame implements ActionListener {
    private List<item> itemList;
    private List<String> typeList;
    private List<item> buyed = new ArrayList();
    Shopee SP = new Shopee(ShopTypee.Shopee);	//
    
    private static final long serialVersionUID = 1L;
    MenuBar menuBar;    // ��甈�
    Menu student;       // ��
    MenuItem main, search, buycart; // �����
    Panel contentPanel; // �摰寥�嚗銝�瘛餃�隞�����

    public MyFrame_Shopee(List<String> types, List<item>items) {
    	SP.GUIList = buyed;
    	
        this.itemList = items;
        this.typeList = types;
        // �����辣
        menuBar = new MenuBar();
        student = new Menu("Function");
        main = new MenuItem("Main");
        search = new MenuItem("Search");
        buycart = new MenuItem("buycart");
        contentPanel = new Panel();

        // ����溶���辣���
        main.addActionListener(this);
        search.addActionListener(this);
        buycart.addActionListener(this);

        // 閮剔蔭蝒���甈�����������
        student.add(main);
        student.add(search);
        student.add(buycart);
        menuBar.add(student);
        setMenuBar(menuBar);

        // 閮剔蔭雿�������蝞∠���ontentPanel瘛餃�蝒銝剖��蔭��
        setLayout(new BorderLayout());
        contentPanel.add(new Label("Hello"));    // 甇∟���
        add(contentPanel, BorderLayout.CENTER);
        
        // 蝒��隞�
        setTitle("Shopee");
        setBounds(300, 50, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source == main) {
           showSpecifiedPanel(contentPanel, new main_Shopee("main",typeList,itemList,buyed,SP));
        } else if (source == search) {
           showSpecifiedPanel(contentPanel, new search_Shopee("search",typeList,itemList,buyed,SP));
        } else if (source == buycart) {
          showSpecifiedPanel(contentPanel, new buycart_Shopee("buycart",buyed,SP));
      }
    }

    // 隞卉ontentPanel�摨�銝��閬�內��anel�摰�(���anel)��
    private void showSpecifiedPanel(Panel contentPanel, Panel showPanel) {
        contentPanel.removeAll();
        contentPanel.add(showPanel);
        contentPanel.validate();
        contentPanel.repaint();
    }
    
}

// 蝪⊥����������(雿輻����摰儔)
class main_Shopee extends Panel {
    public main_Shopee(String msg,List<String> types, List<item> items, List<item> buyed,Shopee FP) {
      this.removeAll();
      main_Shopee ma = this;
      JComboBox menu = new JComboBox();
      menu.addItem("Please chose");
      for(String find : types) {
        menu.addItem(find);
        //System.out.println(find);
      }
      menu.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // TODO Auto-generated method stub
          String sel = (String)menu.getSelectedItem();
           for(item findItem: items) {
             if(sel.equals(findItem.getType())) {
               System.out.println(findItem.getName());
               ma.addButton(findItem,buyed,FP);
             }
           }
        }  
      });
      this.add(menu);
    }
    
    public void addButton(item find,List<item> buyed,Shopee FP) {
      JButton button2 = new JButton(find.getName() + " " + find.getPrice());
      button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
          // TODO Auto-generated method stub
          buyed.add(find);
          FP.select(find);
        }
      });
      this.add(button2);
    }
}

class search_Shopee extends Panel {
  public search_Shopee(String msg,List<String> types, List<item>items,List<item> buyed,Shopee FP) {
      JTextField enterField = new JTextField(20);
      search_Shopee se = this;
      Panel panel = this;
      JButton button = new JButton("Search");
      button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {     
          String find = (String)enterField.getText();
          for(item findItem: items) {
            if(findItem.getName().contains(find)) {
              se.addButton(findItem,buyed,FP);
              System.out.println(findItem.getName() + " " + findItem.getPrice());
              //record.add(findItem);
            }
          }  
        }
      });
      panel.add(enterField);
      panel.add(button);
  }
  public void addButton(item find,List<item> buyed,Shopee FP) {
    JButton button2 = new JButton(find.getName() + " " + find.getPrice());
    button2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        buyed.add(find);
        FP.select(find);
      }
    });
    this.add(button2);
  }
}


class buycart_Shopee extends Panel {
  List<item> buyed;
  
  public buycart_Shopee(String msg,List<item> buylist,Shopee FP) {
      buyed = buylist;
      buycart_Shopee buy = this;
      JButton dealbutton = new JButton("deal");
      dealbutton.addActionListener(new ActionListener() {
    	  @Override
    	  public void actionPerformed(ActionEvent e) {
    		  buy.Reset(buyed,FP);
    	  }
      });
      this.add(dealbutton);
      
      
      
      for(item find:buyed) {
        JButton button = new JButton(find.getName() + " " + find.getPrice());
        button.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            //buy.remove((JButton)e.getSource());
          }
        });
        this.add(button);
      }
  }
  
  public void Reset(List<item> buy,Shopee FP) {
	  FP.Checkout((ArrayList)buy);
	  this.removeAll();
	  this.setVisible(false);
	  int sum = 0;
	  for(item find: buy) {
	    sum += find.getPrice();
	  }
	  JLabel sumField = new JLabel();
	  sumField.setSize(100, 30);
	  sumField.setText("Sum :" + Integer.toString(sum));
	  this.add(sumField);
	  this.setVisible(true);
	  
  }
  
}

class deal_Shopee extends Panel {
  public deal_Shopee(String msg,List<item> buyed) {
      
  }
}
