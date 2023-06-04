package day07_dersTekrari;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        //Kullanicidan mesafeyi km olarak alin ve cevirmek istedigi birimi sorun
        //istedigi birim m veya cm ise cevap yazdirin
        //yoksa "istediginiz birim sisteme kayitli degil" yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Mesafeyi pozitif tamsayi (km) olarak giriniz : ");
        double km = scan.nextDouble();

        System.out.println("Cevirmek istediginiz birimi yazin (cm veya m) : ");
        char yenibirim = scan.next().charAt(0);

        if (km<0) {
            System.out.println("Lutfen gecerli bir sayi girin");
        } else if (yenibirim=='C' || yenibirim=='c') {
            System.out.println(km*100000 + " cm");
        } else if (yenibirim=='M' || yenibirim=='m') {
            System.out.println(km*1000 + " m");
        } else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
    }
}
