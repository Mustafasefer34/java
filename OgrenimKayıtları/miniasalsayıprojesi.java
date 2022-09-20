package intro16;

public class miniasalsayıprojesi{

    public static void main(String[] args) {
        
      int sayi = 37;
   
      boolean asalMı=true;
      
      if(sayi==1) asalMı=false;
      
      for(int i=2; i<sayi;i++) {
    	  if(sayi%i==0) {
    		 
    		asalMı=false;    				
    	  }
      }
     if(sayi<1) System.out.println("sayi asal değidlir");
     else if(asalMı==true) System.out.println("sayı asaldır");
     else if(asalMı==false) System.out.println("sayı asal değildir");
     
    	 
    }

}