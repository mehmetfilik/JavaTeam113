package day03_dersTekrari;

import java.util.Scanner;

public class C04 {

    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu alip, dikdortgenin alanini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdortgen icin bir kenar uzunlugu giriniz");

        double kenar1 = scan.nextDouble();

        System.out.println("Lutfen dikdortgen icin bir kenar uzunlugu daha giriniz");

        double kenar2 = scan.nextDouble();

        double alan = kenar1*kenar2;

        System.out.println("Alan : " + alan);

        //Lutfen dikdortgen icin bir kenar uzunlugu giriniz
        //10
        //Lutfen dikdortgen icin bir kenar uzunlugu daha giriniz
        //20
        //Alan : 200.0
        //
        //Process finished with exit code 0


    }
}
