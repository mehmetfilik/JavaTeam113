package day26_localTime;

import java.util.Arrays;

public class C08_Varargs {

    public static void main(String[] args) {

        topla(3,6); // Toplam : 9
        topla(3,4,5); //Toplam : 12
        topla(3,4,5,6); // Toplam : 18
        topla(3,4,5,6,7); // Toplam : 25

    }
    public static void topla(int... a){

        System.out.println(Arrays.toString(a));

        int toplam = 0;

        for (int each:a
             ) {
            toplam += each;
        }
        System.out.println("Toplam : " + toplam);
    }

    /*
        Java'da bir method parametrelerine uygun argumente sahip
        method call oldugunda calisir

        Ornegin 2 int parametre varsa
        sadece 2 int argument ile method call yapildiginda calisir

        Java ayni data turune sahip olmak sartiyla
        parametre sayisini esnek tutabilmek icin varargs olusturmustur

        varargs bir array'dir

        dolayisiyla method'da array elementlerini
        istedigimiz isleme uygun kullanabiliriz
     */

}
