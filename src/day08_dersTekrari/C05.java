package day08_dersTekrari;

import java.util.Locale;
import java.util.Scanner;

public class C05 {

    public static void main(String[] args) {

        System.out.println("Lutfen gun ismi giriniz: ");
        Scanner scan = new Scanner(System.in);
        String gunIsmi = scan.nextLine();

        if (gunIsmi.equalsIgnoreCase("pazartesi")) {
            int kalanGun = 5;
            System.out.println("Hafta sonuna " + kalanGun + " gün kaldı.");
        } else if (gunIsmi.equalsIgnoreCase("sali")) {
            int kalanGun = 4;
            System.out.println("Hafta sonuna " + kalanGun + " gün kaldı.");
        } else if (gunIsmi.equalsIgnoreCase("çarşamba")) {
            int kalanGun = 3;
            System.out.println("Hafta sonuna " + kalanGun + " gün kaldı.");
        } else if (gunIsmi.equalsIgnoreCase("persembe")) {
            int kalanGun = 2;
            System.out.println("Hafta sonuna " + kalanGun + " gün kaldı.");
        } else if (gunIsmi.equalsIgnoreCase("cuma")) {
            int kalanGun = 1;
            System.out.println("Hafta sonuna " + kalanGun + " gün kaldı.");
        } else if (gunIsmi.equalsIgnoreCase("cumartesi") || gunIsmi.equalsIgnoreCase("pazar")) {
            System.out.println("Şimdi dinlenme zamanı.");
        } else {
            System.out.println("Geçersiz bir gün ismi girdiniz.");
        }


    }


}


