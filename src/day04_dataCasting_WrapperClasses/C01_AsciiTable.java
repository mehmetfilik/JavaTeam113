package day04_dataCasting_WrapperClasses;

public class C01_AsciiTable {

    public static void main(String[] args) {

        /*
        a ==> 1 ve 0 lara cevirmek
        24 ==>  11000
        a ==> 97 ==> 101000

        char data türündeki variable ve degerler sayisal data turlerine atanirsa veya
        sayisal data turundeki datalarla isleme sokulursa
        ASCII table daki degerleri ile isleme girer
         */

        System.out.println(5 + 'a'); // 5 + 97 = 102

        char ilkharf = 101;

        System.out.println(ilkharf); // e

        /*
        kullanicinin verdigi harften bir sonraki harfi yazdirin
         */

        char girilenChar= 'f';

        System.out.println(girilenChar + 1); // 102 + 1 = 103
        // biz 103 degil 103'un karsiligi olan char ifadeyi yazdirmak istersek explicit casting yapmamiy lazim

        System.out.println("Girilen harfin bir sonrasi : "+(char)(girilenChar + 1)); // Girilen harfin bir sonrasi : g

        // verilen bir harften 2 onceki harfi yazdirin

        girilenChar='M';

        System.out.println(girilenChar-2); // 77-2 =75

        System.out.println("Girilen harfin iki oncesi : " + (char) (girilenChar-2)); //Girilen harfin iki oncesi : K

        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.












    }



}
