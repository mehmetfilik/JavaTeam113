package day20_dersTekrari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {


        // Soru 6- Kullanicidan main method'ta pozitif bir tamsayi alip,
        //      o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //      bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bolenleri bulunacak pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();

        System.out.println(pozitifBolenler(girilenSayi));




    }

    private static List<Integer> pozitifBolenler(int girilenSayi) {

        List<Integer> pozitifBolenListesi = new ArrayList<>();

        for (int i = 1; i <girilenSayi ; i++) {

            if (girilenSayi%i == 0){
                pozitifBolenListesi.add(i);
            }
        }
        return pozitifBolenListesi;

    }
}
