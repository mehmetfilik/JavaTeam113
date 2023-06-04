package day12_dersTekrari;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin: ");
        int sayi = scan.nextInt();

        int faktoryel = 1;

        for (int i = sayi; i >0 ; i--) {
            faktoryel*=i;
        }
        System.out.println(sayi + "! : " + faktoryel);
    }
}
