package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsuleDatalar;

public class AccessModifierKullanimi {

    public static void main(String[] args) {

        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();
        System.out.println(obj.toplamSatis); // read yetkisi
        obj.toplamSatis = 100; // write yetkisi

        //System.out.println(obj.satisTutari); // read yetkisi yok
        //obj.satisTutari = 100; // write yetkisi yok


        /*
            Baska bir class'daki variable veya method'a ulasmak istedigimizde

            - ulasmak istedigimiz class uyesinin static olup olmamasi
                erisim yontemini etkiler
                static ise classIsmi.uyeIsmi yazarken
                static degilse obje olusturup objeIsmi.uyeIsmi yazariz

            - ulasmak istedigimiz uyenin access modifier'i ise
                o uyeye ulasip ulasmaayacagimizi belirler

                ulsabilirsek o datayi okuyabilir veya o dataya yeni deger atayabiliriz

         */

    }



}
