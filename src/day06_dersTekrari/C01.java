package day06_dersTekrari;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%5 ==0 && sayi>=0){
            System.out.println("sayi 5'in tam kati");
        } else {
            System.out.println("sayi 5'in tam kati degil");
        }



    }

}
