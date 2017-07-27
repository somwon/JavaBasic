
public class Item {
	
	String sName;
	int nCoast;
	
	Item(String a,int b){
		sName = a;
		nCoast = b;
		
	}
	
	String getpoint() {
		return sName + ":" + nCoast;
	}
	

}
