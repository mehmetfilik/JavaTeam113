package day14_dersTekrari;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        //Kullanicidan toplanmak uzere sayilar alin
        //toplam 500'u asinca
        //kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen toplamak uzere pozitif tamsayi giriniz: ");

        int toplam = 0;
        int sayac = 0;
        while (toplam<=500){
            int sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }
        System.out.println("Girilen "+sayac + " adet sayinin toplami : "+toplam);

    }
}
