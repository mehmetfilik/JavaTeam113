package day14_dersTekrari;

import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {

        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlari saglayan sifre oldugunda
        // "5.denemenizde basarili sifre olusturuldu" seklinde aciklama yazdirin
        // -ilk harf kucuk harf lmali
        // -son harf buyuk harf olmali
        // -bosluk icermemeli
        // -8 karakter veya daha uzun olmali

        Scanner scan = new Scanner(System.in);


        int flag =0;
        String sifre = "";
        int sayac=0;

        while (flag!=4){

            flag=0;

            System.out.println("Lutfen sifrenizi giriniz: ");
            sifre = scan.nextLine();

            if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
                flag++;
            }else {
                System.out.println("ilk karakter kucuk harf olmali");
            }
            if (sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z'){
                flag++;
            }else {
                System.out.println("son karakter buyuk harf olmali");
            }
            if (!sifre.contains(" ")){
                flag++;
            }else {
                System.out.println("bosluk icermemeli");
            }
            if (sifre.length()>=8){
                flag++;
            }else {
                System.out.println("8 karakter veya daha uzun olmali");
            }

            sayac++;
        }
        if (flag==4){
            System.out.println(sayac +". denemenizde basarili bir sekilde sifre olusturuldu");
        }
    }
}
