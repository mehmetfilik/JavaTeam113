package day17_dersTekrari;

import java.util.Arrays;
import java.util.Scanner;

public class C07 {

    public static void main(String[] args) {

        // Kullanicidan array olusturmak uzere pozitif tamsayilar sayilar alin
        // Kullaniciya islemi bitirmesi icin sifira basmasi gerektigini soyleyin
        // Bir onceki class'dan method kullanarak aldiginiz elementleri array'e ekleyin

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 1;
        int[] arr = new int[0];

        while (girilenSayi != 0){

            System.out.println("Array'e eklemek icin pozitif tamsayilar girin" +
                    "\nislemi bitirmek icin 0'a basin");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0){

                arr = C06.elementEkle(arr,girilenSayi);

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}