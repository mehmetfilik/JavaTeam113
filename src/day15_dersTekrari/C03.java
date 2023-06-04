package day15_dersTekrari;

import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {

        //kullanicidan toplanmak uzere sayilar alin
        //kullaniciya bitirmek icin 0'a basmasini soyleyin
        //kullanici 0'a bastiginda
        //0 haric kac sayi girdigini ve toplamlarini yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi=1;
        int toplam = 0;
        int sayac =0;

        while (sayi!=0){
            System.out.println("Lutfen bir tamsayi giriniz");
            sayi = scan.nextInt();
            toplam +=sayi;
            sayac++;
        }
        System.out.println(sayac + " sayinin toplami : " + toplam);
    }
}
