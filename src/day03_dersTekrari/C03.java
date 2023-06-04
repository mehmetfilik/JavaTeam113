package day03_dersTekrari;

import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {

        //*Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //                    Isminiz : John
        //                    Soyisminiz : Doe
        //                    Yasiniz : 44
        //                    Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        byte yas = scan.nextByte();

        System.out.println("Isminiz : " + isim +
                "\nSoyisminiz : " + soyisim +
                "\nYasiniz : " + yas);

        //Lutfen isminizi giriniz
        //mehmet
        //Lutfen soyisminizi giriniz
        //filik
        //Lutfen yasinizi giriniz
        //32
        //Isminiz : mehmet
        //Soyisminiz : filik
        //Yasiniz : 32
        //
        //Process finished with exit code 0



    }
}
