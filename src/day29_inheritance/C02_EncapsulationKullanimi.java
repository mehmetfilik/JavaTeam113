package day29_inheritance;

public class C02_EncapsulationKullanimi {

    public static void main(String[] args) {

        C01 obj = new C01();

        obj.isim = "Melike"; // write
        System.out.println(obj.isim); // read

        obj.setSayi(40); // write
        System.out.println(obj.getSayi()); // read

        /*
            bir class uyesinin public olmasi ile
            private yapilip, getter ve setter method'larinin olusuturlmasi
            islevsel acidan ayni sonucu olusturur

            Bazi developer'lar set ve get yetkilerinin
            kullanildigini vurgulamak icin
            2.yontemi tercih ederler.

         */

    }
}
