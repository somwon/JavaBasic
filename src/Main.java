
 class Main {

	public static void main (String [ ] args) {

    Mart i = new Mart();
    i.list[0] = new Item("사과",100);
    i.list[1] = new Item("포도",700);
    i.list[2] = new Item("배",900);
    i.list[3] = new Item("메론",1000);
 
    	i.addCart(i.list[0]);
    	i.addCart(i.list[0]);
    	i.addCart(i.list[3]);
    	
    	i.getPrint();
    
    
    
	
	
	
	
	}		
}

