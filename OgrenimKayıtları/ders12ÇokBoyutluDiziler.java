package intro_11;

public class ders12ÇokBoyutluDiziler {

	public static void main(String[] args) {
		 String[][] sehirler = new String[2][2];
				 
			sehirler[0][0]= "istanbul"; 
			sehirler[0][1]= "ankara";
			sehirler[1][0]= "izmir";
			sehirler[1][1]= "konya";
				
         for(int i=0; i<2; i++) {
        	 for(int j=0;j<2;j++) {
        		 System.out.println(sehirler[i][j]);
        	 }
         }
            	
  	
	
	
	
	}

}
