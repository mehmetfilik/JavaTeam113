package day03_scanner_dataCasting;

public class C05_DataCasting {

    public static void main(String[] args) {

        /*
        bazi primitive data turleri baska hic bir data turunden deger kabul etmez
        bazi primitive data turleri ozel sartlar ile baska turdeki data turlerini kabul eder
         */

        boolean bl = false;

        bl= true;

        //bl="true";
        //bl= 20;
        //bl ='a'; bu ücü kabul olmuyor

        char ch= 't';
        ch = '%';
        ch = ' ';
        ch = 99;

        int sayi1 = 20;

        short sayi2 = 15;

        double sayi3 = 24;
        //Auto-Widening Otomatik Genisletme asagidaki kapsam sirasina gore java tarafindan kabul edilir
        // byte<short<int<long<float<double

        sayi1 = sayi2; //int<=== short
        //sayi1= sayi3; kabul etmedi   int <=== double

        //sayi2 = sayi1; kabul etmedi   short <=== int

        //sayi2= sayi3; kabul etmedi    short <=== double

        sayi3 = sayi1; // double <=== int

        sayi3= sayi2; // double <=== short

        sayi1 = ch;  //
        //sayi2 = ch; kabul etmedi
        sayi3 = ch;




















    }



}
