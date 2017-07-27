import java.util.ArrayList;

public class Mart {
	
    Item[] list;
    int itemSize = 5;
    ArrayList cart;
    
    
    Mart(){
    	  list = new Item[itemSize];
    	  cart = new ArrayList<Item>();
    }
    
    int getsum() {
		int nSum = 0;
		
		for(int i = 0 ; i < itemSize; i++) {
			nSum += list[i].nCoast;
		}
		
		return nSum;
	
	}
    
    
    void getPrint() {
    	
    		int nTotal = 0;
    		for(int i= 0; i < cart.size(); i++) {
    			
			System.out.println( ((Item)cart.get(i)).sName + ":" + ((Item)cart.get(i)).nCoast);
			nTotal += ((Item)cart.get(i)).nCoast;
			//cart[0]
		}
    		
    		System.out.println("결제하실 금액은 총 " + nTotal + "원 입니다.");
		
    }
    
    void addCart(Item it) {
    		cart.add(it);
    }
 }
	
	
	
	 
   

