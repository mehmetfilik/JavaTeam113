package day12_dersTekrari;

import java.util.Scanner;

public class C09 {

    public static void main(String[] args) {

        /*
        1             1. satir 1’den 1’e kadar yazdir
        1 2           2. satir 1’den 2’e kadar yazdir
        1 2 3         3. satir 1’den 3’e kadar yazdir
        1 2 3 4.      4. satir 1’den 4’e kadar yazdir

         */

        System.out.println("Lutfen bir sayi giriniz: ");
        Scanner scan = new Scanner(System.in);
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }


    }
}
