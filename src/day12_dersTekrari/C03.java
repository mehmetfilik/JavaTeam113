package day12_dersTekrari;

import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {


        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic icin bir pozitif tamsayi girin: ");
        int bas = scan.nextInt();
        System.out.println("Lutfen bitis icin bir pozitif tamsayi girin: ");
        int bit = scan.nextInt();

        int toplam = 0;

        if (bas<=bit) {
            for (int i = bas; i <=bit ; i++) {
                toplam += i;
            }
        }else {
            for (int i = bas; i >=bit ; i--) {
                toplam += i;
            }
        }
        System.out.println("Toplam : " + toplam);
    }
}
