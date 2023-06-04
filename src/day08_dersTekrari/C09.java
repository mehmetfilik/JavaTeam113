package day08_dersTekrari;

import java.util.Scanner;

public class C09 {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int a = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int b = scan.nextInt();

        System.out.println(a<b? a:b);
    }
}
