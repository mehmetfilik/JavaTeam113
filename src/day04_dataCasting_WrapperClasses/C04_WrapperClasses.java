package day04_dataCasting_WrapperClasses;

public class C04_WrapperClasses {

    public static void main(String[] args) {

        // non-primitive data turlerinin hazir methodlari varken
        //primitive data turlerinin hazir methodlari yoktur
        //Java primitive data turleri icin kolayca gecis yapabilecekleri
        //non primitive data turleri olusturmustur

        /*
        int ==> Integer
        char ==> Character
        byte ==> Byte
        boolean ==> Boolean
         */

        Integer sayi=10;
        //int variable a atadigimiz degerleri atayabiliyoruz
        //arti olarak hazir methodlari var

        //variable olusturmadan da bazi methodlari kullanabiliyoruz
        System.out.println(Integer.MIN_VALUE); // Integer.MIN_VALUE.sout yazinca otomatik olarak bu satiri yazar
        System.out.println(Integer.MAX_VALUE); // max ve min degerleri onemli, ihtiyacimiz olabilir

        String sonucStr= "345";

        System.out.println(sonucStr+10); // 34510

        // bu degere 10 ekleyin

        //int sonuc= (int)sonucStr;
        //bu durumda Wrapp Classlar imdada yetisir

        int sonuc= Integer.parseInt(sonucStr); //cok kullanilir
        System.out.println(sonuc+10);  // 355

        sonuc = Integer.valueOf(sonucStr);
        System.out.println(sonuc+10); //355

        char krk='3';

        System.out.println(Character.isDigit(krk)); //true
        System.out.println(Character.isLetter(krk)); //false

        System.out.println(Character.isAlphabetic(krk)); //ctrl tusuna basarak isAlphabetic uzerine girersen okuyucu moda geciyor




    }
}
