public class Ders26variablearguments {

    public static void main(String[] args) {

        int[] sayilar= {3,4,7,5,2,10};

        System.out.println("en buyuk sayi : " + EnBuyukSayiBulma(sayilar));
        //Yazdirma(max);

    }

    public static int EnBuyukSayiBulma(int... sayilar) {

        int max=sayilar[0];

        for(int i=0 ; i<sayilar.length ; i++) {

            if(sayilar[i]>max) max=sayilar[i];

        }

        return max;

    }

    public static void Yazdirma(int max) {

        System.out.println("En buyuk sayi "+max+"'dir");

    }

}