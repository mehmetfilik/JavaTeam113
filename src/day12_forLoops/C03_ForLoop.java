package day12_forLoops;

import java.util.Scanner;

public class C03_ForLoop {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic sayisini pozitif tamsayi olarak girin: ");
        int bas = scan.nextInt();

        System.out.println("Bitis sayisini pozitif tamsayi olarak girin: ");
        int bit = scan.nextInt();

        int sayiToplami = 0;

        if (bas <= bit) {
            for (int i = bas; i <= bit; i++) {
                sayiToplami += i;
            }

        } else{ //baslangic degeri bitis degerinden buyukse
                for (int i = bas; i >= bit; i--) {
                    sayiToplami += i;

                }
            System.out.println("Sayilar Toplami: " + sayiToplami);


            }

    }
}