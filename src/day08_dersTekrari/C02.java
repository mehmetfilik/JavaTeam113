package day08_dersTekrari;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

    /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        hatali giris yaparsa kullaniciyi uyarin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi Girin Kadin icin (K), Erkek icin (E)");

        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lutfen Yasinizi Girin");

        int yas = scan.nextInt();

        if (cinsiyet=='k' || cinsiyet=='K'){
            if (yas>=60 && yas<=120){
                System.out.println("Emekli olabilirsin");
            } else if (yas >= 0 && yas<60) {
                System.out.println("Emekli olmak icin " + (60-yas)+ " yil daha calismalisin" );
            }


        } else if (cinsiyet=='e' || cinsiyet=='E') {
            if (yas>=65 && yas<=120){
                System.out.println("Emekli olabilirsin");
            } else if (yas>=0 && yas<65) {
                System.out.println("Emekli olmak icin " + (65-yas)+ " yil daha calismalisin");
            }


        } else {
            System.out.println("Hatali Giris Yaptiniz");

        }


    }
}