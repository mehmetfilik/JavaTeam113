package day15_dersTekrari;

import java.util.Scanner;

public class C04 {

    public static void main(String[] args) {

        //kullanicidan toplanmak uzere sayilar alin
        //kullaniciya bitirmek icin 0'a basmasini soyleyin
        //kullanici 0'a bastiginda
        //0 haric kac sayi girdigini ve toplamlarini yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi=1;
        int toplam = 0;
        int sayac =0;

        do {
            System.out.println("Lutfen toplamak uzere tamsayi griniz"+
                    "\nBitirmek icin 0'a basiniz");
            sayi= scan.nextInt();
            if (sayi!=0){

                toplam += sayi;
                sayac++;

            }

        }while (sayi!=0);
            System.out.println(sayac + " sayinin toplami : " + toplam);


    }
}
