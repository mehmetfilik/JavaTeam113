package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C06_ifElseIf {

    public static void main(String[] args) {

        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy))
        // vucut kitle endeksi
        // 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz (kg) : ");
        double kilo = scan.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz (cm) : ");
        double boy = scan.nextDouble();
        
        double endeks = ((kilo*10000)/(boy*boy));
        

        if (kilo<=0 || boy<=0 || boy>=300 || kilo>=500){
            System.out.println("Yanlis giris yaptiniz, tekrar deneyin");
        } else if (endeks>=30){
            System.out.println("Vücut kitle endeksiniz: "+ endeks +
                    "\nBu sonuca gore obezsiniz.");
        } else if (endeks>=25) {
            System.out.println("Vücut kitle endeksiniz: "+ endeks +
                    "\nBu sonuca gore kilolusunuz.");
        } else if (endeks>=20) {
            System.out.println("Vücut kitle endeksiniz: "+ endeks +
                    "\nBu sonuca gore normalsiniz.");
        } else {
            System.out.println("Vücut kitle endeksiniz: "+ endeks +
                    "\nBu sonuca gore zayifsiniz.");
        }

    }
}
