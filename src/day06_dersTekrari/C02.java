package day06_dersTekrari;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        //Kullanicidan bir harf alin
        //harf ile baslayan bir ay varsa yazdirin
        //not:buyuk kucuk harf hassasiyeti olmasin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");

        char harf = scan.next().charAt(0);

        if (harf=='o' || harf=='O' ){
            System.out.println("\'O\' harfiyle baslayan ay: Ocak");
        }
        if (harf=='s' || harf=='S' ){
            System.out.println("\'S\' harfiyle baslayan ay: Subat");
        }
        if (harf=='m' || harf=='M' ){
            System.out.println("\'M\' harfiyle baslayan aylar: Mart ve Mayis");
        }
        if (harf=='N' || harf=='n' ){
            System.out.println("\'N\' harfiyle baslayan ay: Nisan");
        }
        if (harf=='h' || harf=='H' ){
            System.out.println("\'H\' harfiyle baslayan ay: Haziran");
        }
        if (harf=='t' || harf=='T' ){
            System.out.println("\'T\' harfiyle baslayan ay: Temmuz");
        }
        if (harf=='a' || harf=='A' ){
            System.out.println("\'A\' harfiyle baslayan aylar: Agustos ve Aralik");
        }
        if (harf=='e' || harf=='E' ){
            System.out.println("\'E\' harfiyle baslayan aylar: Eylul ve Ekim");
        }
        if (harf=='k' || harf=='K' ){
            System.out.println("\'K\' harfiyle baslayan ay: Kasim");
        }


    }
}
