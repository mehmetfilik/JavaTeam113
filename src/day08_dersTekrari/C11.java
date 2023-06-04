package day08_dersTekrari;

import java.util.Scanner;

public class C11 {

    public static void main(String[] args) {

        //kullanicidan bir harf isteyin
        //o harfle baslayan gun ismi varsa yazdirin
        //yoksa gecersiz harf yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);
        harf = Character.toUpperCase(harf);

        switch (harf) {

            case 'P' :
                System.out.println("Pazar, Pazartesi, Persembe");
            break;
            case 'S' :
                System.out.println("Sali");
            break;
            case 'C' :
                System.out.println("Carsamba, Cuma, Cumartesi");
            break;
            default:
                System.out.println("Gecersiz harf");


        }




    }
}
