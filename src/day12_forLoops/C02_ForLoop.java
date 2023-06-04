package day12_forLoops;

import java.util.Scanner;

public class C02_ForLoop {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic sayisini pozitif tamsayi olarak girin: ");
        int bas = scan.nextInt();

        System.out.println("Bitis sayisini pozitif tamsayi olarak girin: ");
        int bit = scan.nextInt();

        int sayiToplami =0;

        if (bit<bas) {
            System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
        } else {
            for (int i = bas; i <=bit ; i++) {
                sayiToplami +=i;
            }
        }
        System.out.println("Sayilarin Toplami: " + sayiToplami);

    }
}
