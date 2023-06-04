package day05_incrementDecrement_Concatenation;

public class C02_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        // a'nin degerini 1 artirin ve yeni degerini olusturacaginiz b vairable'ina atayin

        int a =20;

        int b = ++a; // once artirir sonra atama yapar

        /*a++;

        int b= a;

         */

        System.out.println("a : " + a + ", b : " + b); //a : 21, b : 21

        // a'nin degerini b'ye atayin sonra a'nin degerini 1 artirin

        a=20;
        b  = a++; // once atama yapar sonra artirir

        /*b=a ;

        a++;

         */

        System.out.println("a : " + a + ", b : " + b); //a : 21, b : 20

        //bu islemleri istersek tek satirda yapabiliriz

        //a'nin degerini yazdirin ve sonra a'yi 1 artirin

        a= 20;

        System.out.println("a : " +a); // a : 20

        a ++;

        a=20;
        System.out.println("a : " + a++); // a : 20 once atama yapar sonra artirir
        System.out.println("a : " + a); // a : 21

        // a'nin degerini 1 azaltin ve sonra yeni degerini yazdirin

        a=20;
        System.out.println("a : " + --a); // a : 19 once azaltip sonra atama yapar
        System.out.println("a : " + a); // a : 19

        /*
        Eger sayinin degeri SADECE 1 artirip azaltma yapilacaksa
        once veya sonra artirip azaltma
        bu islemler tek satirda yapilabilir
         */





    }


}
