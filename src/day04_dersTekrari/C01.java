package day04_dersTekrari;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {

        //Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Sayi1'i giriniz (tamsayi)");

        int sayi1 = scan.nextInt();

        System.out.println("Lutfen Sayi2'i giriniz (tamsayi)");

        int sayi2 = scan.nextInt();

        System.out.println("Lutfen Sayi3'i giriniz (tamsayi)");

        int sayi3 = scan.nextInt();

        double ortalama = (sayi1+sayi2+sayi3)/3;

        System.out.println("Aritmetik ortalama : " + ortalama);

        //Lutfen Sayi1'i giriniz (tamsayi)
        //6
        //Lutfen Sayi2'i giriniz (tamsayi)
        //15
        //Lutfen Sayi3'i giriniz (tamsayi)
        //24
        //Aritmetik ortalama : 15.0





    }

}
