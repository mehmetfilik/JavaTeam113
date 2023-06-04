package day08_dersTekrari;

import java.util.Scanner;

public class C04 {

    public static void main(String[] args) {

        //kullanicidan pozitif bir tamsayi alin
        //sayi cift ise "sayi cift"
        //degilse "sayi tek" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        //if (sayi%2==0) {
        //    System.out.println("sayi cift");
        //} else {
        //    System.out.println("sayi tek");
        //}

        //kullanicidan bir tamsayi alip mutlak degerine cevirin ve yazdirin

       // if (sayi<0) {
       //     System.out.println(sayi*(-1));
       // } else System.out.println(sayi);
//
        //sayi = sayi<0 ? sayi*(-1) : sayi;
        //System.out.println(sayi);

        System.out.println(sayi<0 ? sayi*(-1) : sayi);




    }
}
