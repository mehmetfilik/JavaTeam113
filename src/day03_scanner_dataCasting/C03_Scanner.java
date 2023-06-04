package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");

        //Kullanicinin girdigi bilgiyi data turunde bir variable olusturun
        //Kullanicidan bilgiyi almak icin scan objesini ve ilgili next methodunu kullan



        double yaricap = scan.nextDouble();

        //cevresini ve alanini yazdirin.

        System.out.println("Yaricap : " + yaricap +
                "\nCemberin cevresi : " + 2*3.14*yaricap + "\n" + "Dairenin alani : " + 3.14*yaricap*yaricap);

        //Lutfen cemberin yaricapini giriniz
        //10
        //Yaricap : 10.0
        //Cemberin cevresi : 62.800000000000004
        //Dairenin alani : 314.0
        //
        //Process finished with exit code 0




    }


}
