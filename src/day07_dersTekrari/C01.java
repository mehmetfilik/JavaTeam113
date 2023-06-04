package day07_dersTekrari;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve liste fiyati alin
        //kullaniciya musteri karti olup olmadigini sorun
        //musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
        //musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);

        System.out.println("Musteri kartiniz varsa Evet, yoksa Hayir yazin lutfen: ");
        char kart = scan.next().charAt(0);

        System.out.println("Lutfen aldiginiz urun sayisini giriniz : ");
        int urun = scan.nextInt();

        if (urun<0 || urun>1000) {
            System.out.println("Yanlis bilgi girdiniz, lutfen tekrar deneyin");
        } else if (kart=='E' || kart=='e' && urun>=10 ) {
            System.out.println("%20 indirim kazandiniz!");
        } else if (kart=='E' || kart=='e' && urun<10 ) {
            System.out.println("%15 indirim kazandiniz!");
        } else if (kart=='H' || kart=='h' && urun>=10 ) {
            System.out.println("%15 indirim kazandiniz!");
        } else if (kart=='H' || kart=='h' && urun<10 ) {
            System.out.println("%10 indirim kazandiniz!");
        } else {
            System.out.println("Yanlis bilgi girdiniz, lutfen tekrar deneyin");
        }
    }
}
