package day03_dersTekrari;

import java.util.Scanner;

public class C05 {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ucuncu bir degisken kullanmadan ikisinin degerlerini degistirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Sayi1'i bir tamsayi olarak giriniz");

        int sayi1 = scan.nextInt();

        System.out.println("Lutfen Sayi2'yi bir tamsayi olarak giriniz");

        int sayi2 = scan.nextInt();

        sayi1 = sayi1 + sayi2;

        sayi2= sayi1 - sayi2;

        sayi1 = sayi1 - sayi2;

        System.out.println("Sayi1 yeni degeri: " + sayi1
        + "\nSayi2 yeni degeri: " + sayi2);

        //Lutfen Sayi1'i bir tamsayi olarak giriniz
        //10
        //Lutfen Sayi2'yi bir tamsayi olarak giriniz
        //20
        //Sayi1 yeni degeri: 20
        //Sayi2 yeni degeri: 10
        //
        //Process finished with exit code 0







    }
}
