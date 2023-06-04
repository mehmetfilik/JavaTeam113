package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif tam sayi giriniz");

        int girilensayi= scan.nextInt(); // 135

        int rakam= girilensayi %10; //5

        int rakamlartoplami = rakam;

        girilensayi = girilensayi / 10;

        rakam= girilensayi %10; //3

        rakamlartoplami = rakamlartoplami + rakam;

        girilensayi = girilensayi / 10;

        rakam= girilensayi %10; //1

        rakamlartoplami = rakamlartoplami + rakam;

        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlartoplami);

        //Lutfen 3 basamakli pozitif tam sayi giriniz
        //135
        //Girilen sayinin rakamlar toplami : 9





    }
}
