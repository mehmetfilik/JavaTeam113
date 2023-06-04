package day04_dersTekrari;

import java.util.Scanner;

public class C04 {

    public static void main(String[] args) {

    //Kullanicidan bir double bir tamsayi alin
    //double sayiyi ikinci sayiya bolun ve bolum isleminin sonucunun tamsayi kismini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen herhangi bir sayi giriniz");

        double sayi1 = scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi2 = scan.nextInt();

        double bolum = sayi1/sayi2;

        int sonuc = (int)bolum;

        System.out.println("Sonuc : " + sonuc);

        //Lutfen herhangi bir sayi giriniz
        //40,5
        //Lutfen bir tamsayi giriniz
        //5
        //Sonuc : 8


    }
}
