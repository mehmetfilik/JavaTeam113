package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_ifElseStatements {

    public static void main(String[] args) {

        /*Eger bir olay icin sadece 2 olasilik varsa
        ve bu olasiliklardan birisi lutlaka calisacaksa
        if Else Statements kullaniriz

        if else statemen'da if body'si veya else body'si mutlaka calisir
        ikisinin birden calisma ihtimali yoktur
        ikisinin de calismama ihtimali yoktur
         */

        //Soru 5- Kullanicidan notunu alin
        // 50 veya daha buyukse “Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not>=50&&not<=100){
            System.out.println("Sinifi gectin");
        }
        else {
            System.out.println("Maalesef kaldin");
        }



        //Kullanicidan pozitif bir tamsayi alin
        //sayinin tek ya da cift sayi oldugunu yazdirin

        System.out.println("Lutfen poyzitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cift sayi");
        } else {
            System.out.println("Girilen sayi tek");
        }


        //Kullanicidan pozitif bir sayi alin
        //5 ile bolunup bolunmedigini yazdirin

        if (sayi%5==0){
            System.out.println("sayi 5 ile tam olarak bolunebilir");
        } else {
            System.out.println("sayi 5 ile tam olarak bolunemez");
        }






    }
}
