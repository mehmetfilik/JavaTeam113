package day10_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {

    public static void main(String[] args) {

        //SORU : kullanicidan bir mail alin
        //  - mail @ icermiyorsa “gecersiz mail”
        //  - mail @gmail.com icermiyorsa, “mail gmail olmali”
        //  - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
        // yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz:");

        String email = scan.nextLine();

        if (!email.contains("@")){
            System.out.println("Gecersiz email: ");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("Email gmail olmali");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Email'de yazim hatasi var");
        }

    }
}
