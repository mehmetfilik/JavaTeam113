package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        /*Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
                    Isminiz : John
                    Soyisminiz : Doe
                    Yasiniz : 44
                    Kaydiniz basariyla tamamlanmistir.
        */
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi yaziniz");

        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scan.nextDouble();
/*
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
*/
        /*
        Lutfen isminizi giriniz
        Mehmet
        Lutfen soyisminizi yaziniz
        Filik
        Lutfen yasinizi giriniz
        32
        Isminiz : Mehmet
        Soyisminiz : Filik
        Yasiniz : 32.0
        Kaydiniz basariyla tamamlanmistir.
         */

        /*
        Lutfen isminizi giriniz
        34
        Lutfen soyisminizi yaziniz
        34
        Lutfen yasinizi giriniz
        mehmet
        Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextDouble(Scanner.java:2413)
	at day03_dataCasting_WrapperClasses.C01_Scanner.main(C01_Scanner.java:27)

        Process finished with exit code 1
         */

        /*Kullanici istedigimiz data turunde bilgi girisi yapmazsa
        kodumuzda hata olusur ve calisma durur
        ileride kullanici hatalarina karsi nasil tedbirler alacagimizi ogrenecegiz.
        SIMDILIK kullanici biz ne istersek o yapiyor kabul edelim.
         */
/*
        System.out.print("Isminiz : " + isim);
        System.out.print("Soyisminiz : " + soyisim);
        System.out.print("Yasiniz : " + yas);
        System.out.print("Kaydiniz basariyla tamamlanmistir.");

        System.out.println() 'deki Ln
yazdirmo islemini yaptiktan sonra
alt satiro gecmesini soglor
println verine print yozarsok
yazdirdigimiz seyler yanyona yazdirilic


        */

        /*
        Lutfen isminizi giriniz
mehmet
Lutfen soyisminizi yaziniz
filik
Lutfen yasinizi giriniz
32
Isminiz : mehmetSoyisminiz : filikYasiniz : 32.0Kaydiniz basariyla tamamlanmistir.
Process finished with exit code 0
         */
/*
        System.out.println("Isminiz : " + isim +
                "Soyisminiz : " + soyisim+
                "Yasiniz : " + yas+
                "Kaydiniz tamamlanmistir.");
                */

        /*
        Lutfen isminizi giriniz
mehmet
Lutfen soyisminizi yaziniz
filik
Lutfen yasinizi giriniz
32
Isminiz : mehmetSoyisminiz : filikYasiniz : 32.0Kaydiniz tamamlanmistir.

Process finished with exit code 0
         */

        /*
        Tek bir System.out.println() ile birden fazla satir yazdirmak isterseniz
        String bir ifadenin icinde istedigimiz yere \n yazabilirsiniz
         */

        System.out.println("Ismi\nniz : " + isim +
                "\nSoyisminiz : " + soyisim+
                "\nYasiniz : " + yas+
                "\nKaydiniz tamamlanmistir.");

/*
Lutfen isminizi giriniz
mehmet
Lutfen soyisminizi yaziniz
filik
Lutfen yasinizi giriniz
32
Ismi
niz : mehmet
Soyisminiz : filik
Yasiniz : 32.0
Kaydiniz tamamlanmistir.

Process finished with exit code 0
 */

        /*
        "" String icindeki bosluklar cikisa yansir. diger bosluklar gorunmez.

        "\n" String icinde ayri sekilde koyulsa yine burdan itibaren satir asagi gecer.
         */






    }




}
