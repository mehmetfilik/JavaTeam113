package day09_dersTekrari;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ay numarasi girin");
        int sayi = scan.nextInt();

        switch (sayi) {

            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilk Bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Tekrar deneyin");
        }
    }
}
