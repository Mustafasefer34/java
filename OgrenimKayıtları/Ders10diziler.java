package intro9;

public class Ders10diziler {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[4];
		
		ogrenciler[0]="bedirhan";
		ogrenciler[1]="ufuk";
        ogrenciler[2]="mustafa";
        ogrenciler[3]="kalafato";

      for(int i=0;i<ogrenciler.length;i++) {
    	  
    	  System.out.println(ogrenciler[i]);
      }
      
      System.out.println("-------------");
	
      for(String ogrenci:ogrenciler) {
    	  
    	 System.out.println(ogrenci); 
      }
	}

}
