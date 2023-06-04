package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // Girilen bilgiler : J Doe, 44

        //ismin ilk harfi isteniyor.

        Scanner scan = new Scanner(System.in);

        //isterseniz tek bir aciklama ile 3 bilgiyi de alabilirsiniz.

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz" +
                "\nHer bilgiden sonra ENTER'a basiniz");

        char isimIlkHarf =scan.nextLine().charAt(0);

        /*
        Scanner methodlarinda nextChar() yok
        bunun icin once kullanicinin girisine gore next() veya nextLine() yazip
        sonra .charAt(0) yazariz
        parantez icindeki 0 almak istedigimiz char'in indexidir.
        ve javada index 0'dan baslar
         */

        String soyisim= scan.nextLine();
        double yas = scan.nextDouble();

        // Girilen bilgiler : J Doe, 44
        System.out.println("Girilen bilgiler : " + isimIlkHarf + " " + soyisim + ", " + yas);

        /*
        Lutfen isminizi, soyisminizi ve yasinizi giriniz
Her bilgiden sonra ENTER'a basiniz
Mehmet
Filik
32
Girilen bilgiler : M Filik, 32.0

Process finished with exit code 0
         */







    }


}
