package day11_dersTekrari;

import java.util.Scanner;

public class C07 {

    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        int flag = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi girin: ");
        String sifre = scan.nextLine();

        if (sifre.charAt(0)>'a' && sifre.charAt(0)<'z' ) {
            flag++;
        } else {
            System.out.println("Ilk harf kucuk harf olmali");
        }
        if (sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9'){
            flag++;
        } else {
            System.out.println("Son karakter rakam olmali");
        }
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
        } else {
            flag++;
        }
        if (sifre.length()<=10) {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
        } else {
            flag++;
        }
        if (flag==4) {
            System.out.println("Sifre basariyla kaydedildi");
        }

    }
}
