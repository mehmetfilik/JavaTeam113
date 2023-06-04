package day12_dersTekrari;

import java.util.Scanner;

public class C10 {

    public static void main(String[] args) {

         /*
                Verilen satir sayisina gore
                asagidaki sekli olusturan kod yazin

                *
                * *
                * * *
                * * * *
         */


        System.out.println("Lutfen bir sayi giriniz: ");
        Scanner scan = new Scanner(System.in);
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
