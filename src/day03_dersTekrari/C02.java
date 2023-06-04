package day03_dersTekrari;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        //Kullanicidan bir double bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir ondalikli sayi giriniz");

        double ondalikli = scan.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");

        int tamsayi = scan.nextInt();

        double toplam = ondalikli+tamsayi;

        System.out.println("Girilen sayilarin toplami : " + ondalikli + " + " +
                tamsayi + " = " + toplam);

        //Lutfen bir ondalikli sayi giriniz
        //10,1
        //Lutfen bir tamsayi giriniz
        //10
        //Girilen sayilarin toplami : 10.1 + 10 = 20.1



    }
}
