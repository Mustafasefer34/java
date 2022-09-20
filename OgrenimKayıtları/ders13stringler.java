package intro_12;

public class ders13stringler {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çoksel.";
        System.out.println(mesaj);

        System.out.println("eleman sayisi : "+ mesaj.length()); //.length eleman sayisi
        System.out.println("5. eleman : "+ mesaj.charAt(4));  //.charAt(i) i. indeksli char
        System.out.println(mesaj.concat(" yaşasın!")); //.concat yanına metin ekleme
        System.out.println(mesaj.startsWith("B")); //.startsWith("i") ile mi başlıyor
        System.out.println(mesaj.endsWith(".")); //.startsWith("i") ile mi bitiyor
        System.out.println(mesaj.indexOf("a")); //.indexOf("a") a'yı bulana kadar metinde ilerler
        System.out.println(mesaj.lastIndexOf("a")); //.indexOf("a") a'yı bulana kadar metinde sondan ilerler

        char[] karakterler = new char[5];
        mesaj.getChars(1,5, karakterler, 0);
        System.out.println(karakterler);

    }

}