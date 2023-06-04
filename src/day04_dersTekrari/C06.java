package day04_dersTekrari;

import java.util.Scanner;

public class C06 {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin sayinin rakamlar toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir sayi giriniz");

        int girilensayi = scan.nextInt();

        int bas1 =  girilensayi %10;

        //girilensayi = girilensayi/10;
        girilensayi /= 10;

        int bas2 = girilensayi %10;

        //girilensayi = girilensayi/10;
        girilensayi /= 10;

        int bas3 = girilensayi%10;

        System.out.println(bas3+"+"+bas2+"+"+bas1+" = "+ (bas1+bas2+bas3));

        //Lutfen 3 basamakli bir sayi giriniz
        //456
        //4+5+6 = 15




    }
}
