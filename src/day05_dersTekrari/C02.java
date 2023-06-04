package day05_dersTekrari;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        //Kullanicidan 2 basamakli bir sayi isteyin
        //Once sayiyi 1 artirin sonra yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 2 basamakli bir sayi giriniz");

        int sayi = scanner.nextInt();

        System.out.println("Girilen sayi + 1 = "+ ++sayi);
        //Lutfen 2 basamakli bir sayi giriniz
        //69
        //Girilen sayi + 1 = 70

        //Once sayiyi 1 azaltin sonra yazdirin sonra 1 artirin

        sayi --;

        System.out.println("Ilk girilen sayi : " + sayi++); //Ilk girilen sayi : 87









    }


}
