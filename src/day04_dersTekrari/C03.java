package day04_dersTekrari;

import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {

        //Kullanicidan 2 double sayi alin, ilk iki sayiyi ikinci sayiya bolun ve
        //bolum isleminin sonucunun tamsayi kismini yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen Sayi1'i giriniz");

        double sayi1 = scan.nextDouble();

        System.out.println("Lutfen Sayi2'i giriniz");

        double sayi2 = scan.nextDouble();

        double bolum = sayi1/sayi2;

        int sonuc = (int)bolum;

        System.out.println("Sonucun tamsayi degeri : " + sonuc);

        //Lutfen Sayi1'i giriniz
        //50
        //Lutfen Sayi2'i giriniz
        //3
        //Sonucun tamsayi degeri : 16



    }
}
