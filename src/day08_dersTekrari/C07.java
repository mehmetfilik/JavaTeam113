package day08_dersTekrari;

import java.awt.*;
import java.util.Scanner;

public class C07 {

    public static void main(String[] args) {

        //kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        //ucgen eskenar ise "Eskenar ucgen" yazdirin
        //degilse "Eskenar degil" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin a kenar uzunlugunu giriniz: ");
        double a = scan.nextDouble();
        System.out.println("Lutfen ucgenin b kenar uzunlugunu giriniz: ");
        double b = scan.nextDouble();
        System.out.println("Lutfen ucgenin c kenar uzunlugunu giriniz: ");
        double c = scan.nextDouble();

        System.out.println(a==b && a==c && b==c? "Eskenar Ucgen" : "Eskenar Ucgen Degil");

    }
}
