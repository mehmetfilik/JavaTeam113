package day05_incrementDecrement_Concatenation;

public class C01_incrementDecrement {

    public static void main(String[] args) {

        int a = 20;

        // a'nin degerini 3 artirin ve yeni degerini olusturacaginiz b vairable'ina atayin

        // a = a+3;

        // a++;
        // a++;
        // a++;

        a += 3;

        int b = a;

        System.out.println("a : " + a + ", b : " + b); // a : 23, b : 23

        // a'nin degerini b'ye atayin sonra a'nin degerini 3 atayin

        a =20;

        b = a;

        a += 3;

        System.out.println("a : " + a + ", b : " + b); // a : 23, b : 20

        //a'nin degerini yazdirin ve sonra a'yi 5 artirin

        a= 20;

        System.out.println("a : " +a); // a : 20

        a += 5;

        // a'yi burada yazdirsak 25 yazardi

        a= 20;

        //a'nin degerini 2 azaltin ve sonra a'nin degerini yazdirin

        a -= 2;

        System.out.println("a : " + a); //a : 18







    }


}
