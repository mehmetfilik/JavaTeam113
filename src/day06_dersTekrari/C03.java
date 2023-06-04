package day06_dersTekrari;

import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 3 pozitif tam sayi giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }
    }
}
