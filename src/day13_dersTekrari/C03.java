package day13_dersTekrari;

import day13_methodOlusturma.C03_Faktoryel;

public class C03 {

    public static void main(String[] args) {

        //kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        //faktoryel degerlerini toplayin

        int sayi1 = C03_Faktoryel.faktoryelHesapla(3);
        int sayi2 = C03_Faktoryel.faktoryelHesapla(4);

        System.out.println(sayi1+sayi2);
    }
}
