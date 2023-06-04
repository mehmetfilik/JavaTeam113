package day20_dersTekrari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip
        // Q'ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun

        System.out.println(KullanicidanListeOlusturma());

    }

    private static List<String> KullanicidanListeOlusturma() {

        List<String> isimler = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String isim = "";

        do {
            System.out.println("Listeye eklemek icin bir isim giriniz"+
                    "\nBitirmek icin Q'ya basin");
            isim = scan.nextLine();

            if (!isim.equalsIgnoreCase("q")){
                isimler.add(isim);
            }

        }while(!isim.equalsIgnoreCase("q"));

        return isimler;
    }
}
