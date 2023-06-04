package day08_dersTekrari;

import java.util.Scanner;

public class C08 {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);


        System.out.println(harf>='a' && harf<='z'? Character.toUpperCase(harf) : harf);

    }
}
