package intro;

public class mini_proje_1_asal_sayi {

    public static void main(String[] args) {
        
        int sayi;
        sayi=20;
        boolean asalMi=true;
        
        if(sayi==1) asalMi=false;
        
        
        for(int i=2;i<sayi;i++) {
            
            if(sayi%i==0) {
                
                 asalMi=false;
                 break;
                 
            }
            
        }
        
        if(sayi<1) System.out.println("sayi gecersiz.");
        else if(asalMi==true) System.out.println("Sayi asaldir.");
        else System.out.println("Sayi asal degildir.");
        

    }

}
