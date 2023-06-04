package day06_dersTekrari;

import java.util.Scanner;

public class C04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        if (harf>='a' && harf<='z'){
            System.out.println(Character.toUpperCase(harf));
        }

    }
}
