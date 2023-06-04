package day12_dersTekrari;

import java.util.Scanner;

public class C06 {

    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve
        // String'i tersine cevirip kaydedin.

        System.out.println("Lutfen bir metin giriniz: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        // output : nitem gibi ters yazmali


        int sonIndex = input.length()-1;

        for (int i = sonIndex; i >=0 ; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
