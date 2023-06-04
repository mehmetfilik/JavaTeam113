package day04_dersTekrari;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi alin kullanici kac degerini girerse girsin, o sayiyi -128 ile 127 arasinda bir sayiya donusturup yazin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi1 = scan.nextInt();

        byte sayi2 = (byte)sayi1;

        System.out.println("Sayinin yeni degeri : " + sayi2);

        //Lutfen bir sayi giriniz
        //12345
        //Sayinin yeni degeri : 57

        //Lutfen bir sayi giriniz
        //10000
        //Sayinin yeni degeri : 16




    }
}
