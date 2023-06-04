package day12_dersTekrari;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic icin bir pozitif tamsayi girin: ");
        int bas = scan.nextInt();
        System.out.println("Lutfen bitis icin bir pozitif tamsayi girin: ");
        int bit = scan.nextInt();

        int toplam =0;
        if (bit<bas) {
            System.out.println("Baslangic degeri bitis degerinden kucuk olmali!");
        } else
        for (int i = bas; i <=bit ; i++) {
            toplam+=i;

        }
        System.out.println("Toplam: " + toplam);
    }
}
