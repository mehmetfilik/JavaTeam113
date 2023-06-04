package day24_staticKeyword;

public class C02_PassByValue {

    public static void main(String[] args) {


        double fiyat = 200;


        /*
        int fiyat = 500;
        String fiyat = "Java pass by value kullanir";

        Java ayni method icerisinde ayni isimde
        birden fazla variable olusutrulmasina izin vermez


         */

        indirimYap10(fiyat); // %10 indirimli fiyat : 180.0
        System.out.println("method call'dan sonra fiyat : " + fiyat); // method call'dan sonra fiyat : 200.0
        indirimYap25(fiyat); // %25 indirimli fiyat : 150.0
        System.out.println("2.method call'dan sonra fiyat : " + fiyat); // .method call'dan sonra fiyat : 200.0
        System.out.println(indirimliFiyatGetir10(fiyat)); // 180.0
        System.out.println("3.method call'dan sonra fiyat : " + fiyat); // 3.method call'dan sonra fiyat : 200.0

        //main methodun icindeki faiyati kalici olarak degistirmek istersek
        // main method icinde atama yapmaliyiz

        fiyat= indirimliFiyatGetir10(fiyat);
        System.out.println("main method'da atama yapildiktan sonra fiyat : " + fiyat); // main method'da atama yapildiktan sonra fiyat : 180.0


    }

    public static void indirimYap10(double fiyat){ //doble fiyat = degeri methodun cagrildigi yerden gelir

        fiyat= fiyat*0.9;
        System.out.println("%10 indirimli fiyat : " + fiyat);


    }

    public static void indirimYap25(double fiyat){
        fiyat= fiyat*0.75;
        System.out.println("%25 indirimli fiyat : " + fiyat);
    }

    public static double indirimliFiyatGetir10(double fiyat){

        fiyat= fiyat*0.9;

        return fiyat;
    }
}
