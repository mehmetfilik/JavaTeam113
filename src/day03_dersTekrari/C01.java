package day03_dersTekrari;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        //Kullanicidan uc farkli data turunde deger alip girilen degerleri aciklamalariyla yazdirin.
        // Lutfen 3 basmakli bir sayi, 5 harfli bir kelime ve bir özel karakter giriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 3 basmakli bir sayi giriniz");

        int sayi = scan.nextInt();

        System.out.println("Lutfen 5 harfli bir kelime giriniz");

        String kelime = scan.next();

        System.out.println("Lutfen bir ozel karakter giriniz");

        char krk = scan.next().charAt(0);

        System.out.println("Girilen sayi : " + sayi +
                            "\nGirilen kelime : " + kelime +
                            "\nGirilen ozel karakter : " + krk);






    }
}
