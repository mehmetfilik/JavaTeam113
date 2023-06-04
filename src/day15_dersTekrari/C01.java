package day15_dersTekrari;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfenpozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int rakamlarToplami = 0;
        int birlerBasamagi = 0;

        while (sayi>0){

            birlerBasamagi=sayi%10;
            sayi /= 10;
            rakamlarToplami += birlerBasamagi;

        }

        System.out.println("Rakamlar toplami : " + rakamlarToplami);
    }
}
