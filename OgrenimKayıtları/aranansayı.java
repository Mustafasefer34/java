package intro20;

public class aranansayı {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		
		int aranacak =8;
          
		boolean varMı=false;
		
		for (int sayi : sayilar) {
			
			if(sayi==aranacak) {
				varMı=true;
			}
		}
	
	    if(varMı) {
	    	
	    	System.out.println("sayı vardır");
	    }else {
	    	System.out.println("sayı yoktur");
	    }
	
	    
	
	
	}

}
