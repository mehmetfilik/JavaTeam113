package day12_dersTekrari;

import java.util.Scanner;

public class C08 {

    public static void main(String[] args) {

        //dinamik oalrak verilen satir ve sutun sayisina gore
        //yildizlardan bir dikdortgen olusturun

        /*
         * * * * *
         * * * * *
         * * * * *
         */

        System.out.println("Lutfen satir sayisi giriniz: ");
        Scanner scan = new Scanner(System.in);
        int satir= scan.nextInt();

        System.out.println("Lutfen sutun sayisi giriniz: ");
        int sutun = scan.nextInt();

        if (satir>=1 && sutun>=1) {
            for (int i = 1; i <= satir; i++) {
                for (int j = 1; j <= sutun; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }

    }
}
