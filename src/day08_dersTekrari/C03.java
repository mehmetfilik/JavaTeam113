package day08_dersTekrari;

import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {

        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        hatali giris yaparsa kullaniciyi uyarin
         */

        //bu kez ana degisken yas olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz: " +
                "\nKadin icin :K, Ekrek icin: E giriniz");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scan.nextInt();

        if (yas<16 || yas>80){
            System.out.println("Hatali yas girisi");

        } else if (yas>=65) { //65-80 arasi
            if (cinsiyet=='k' || cinsiyet=='K' || cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("Emekli olabilirsin");
            }
        } else if (yas>=60) { //60-65 arasi
            if (cinsiyet=='k' || cinsiyet=='K') {
                System.out.println("Emekli olabilirsin");
            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calismalisin");
            } else {
                System.out.println("Hatali cinsiyet girisi");
            }

        } else if (yas>=16) { //16-60 arasi
            if (cinsiyet=='k' || cinsiyet=='K') {
                System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calismalisin");
            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calismalisin");
            } else {
                System.out.println("Hatali cinsiyet girisi");
            }
        }


    }
}
