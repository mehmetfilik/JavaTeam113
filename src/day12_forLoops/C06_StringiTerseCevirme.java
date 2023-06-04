package day12_forLoops;

import java.util.Scanner;

public class C06_StringiTerseCevirme {

    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve
        // String'i tersine cevirip kaydedin.

        System.out.println("Lutfen bir metin giriniz: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        // output : nitem gibi ters yazmali

        String output="";

        for (int i = input.length()-1; i >=0 ; i--) {

            output += input.charAt(i);

        }
        System.out.println(output);

    }
}
