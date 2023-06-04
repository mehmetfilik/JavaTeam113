package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C04_ifElseIf {

    public static void main(String[] args) {

        //kullanicidan pozitif bir tamsayi alin
        //sayi 3 ile tam bolunuyorsa "3'un kati"
        //sayi 5 ile tam bolunuyorsa "5'in kati"
        //sayi hem 3 hem de 5 ile tam bolunuyorsa "3 ve 5'in kati"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");

        int sayi = scan.nextInt();

        if (sayi%3 == 0 && sayi%5 ==0){
            System.out.println("3 ve 5'in kati");
        } else if (sayi%5 == 0) {
            System.out.println("5'in kati");
        } else if (sayi%3 ==0) {
            System.out.println("3'un kati");
        }

        /*
        Bazen sartlar olasi durumlari karsilamaz
        bu durumda if else if ... cumleleri else ile bitmez

        else ile bitmeyen if else if ... cumleleri
        bazi durumlarda hicbir if body'si devreye girmeyebilir
         */


    }
}
