
public class Ders24metodlar {

    public static void main(String[] args) {

    boolean varMı= sayiBulmaca();

    if(varMı) System.out.println("bulundu");
    else System.out.println("bulunamadi");
}

    public static boolean sayiBulmaca() {

     int[] sayilar = new int[] {1,2,3,4,5,6};
     int aranacak = 6;
     boolean varMı=false;


    for(int sayi : sayilar) {
        if(sayi==aranacak) {
            varMı=true;
            break;
        }
    }

    return varMı;

    }

}
    
	

