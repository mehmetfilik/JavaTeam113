package day14_methodOverloading_whileLoop;

public class C04_MethodOverloading {

    public static void main(String[] args) {

        /*
            Java overloading kurallari
            1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
            2-data turleri farkli olan parametrelerin yerlerini degistirirsek
                java yeni bir method olarak kabul eder (int, double) (double, int)

                Overloading olan Class'larda
                Java hangi Methodun calistirilacagina su sekilde karar verir

                1-cagrilan isimde method var mi ?
                2-method call'da kullanilan arguments () icindekiler ile methodlardaki
                    parametrelerin %100 uyumlu oldugu var mi ?
                3-argument ile parametre ayni olmasa bile
                    verilen argumentleri kabul edecek parametre var mi ?
                4-Casting ile birden fazla methodu kullanabiliyorsa
                    daha az casting ile calisacak methodu kullanir

         */


        topla(3,5); // 8
        topla(3.4,2.4); // 5.8

        //topla("ali","veli"); CTE bu argumentleri kabul edecekleri parametre yok

        topla('a','b'); //Iki tamsayinin toplami : 195

        topla(3f,4f); //Iki double sayinin toplami : 7.0

        topla(3f,4); //double ve int sayilarin toplami : 7.0

    }


    public static void topla(int a , int b) {
        System.out.println("Iki tamsayinin toplami : " + (a+b));
    }

    public static void topla(double a , double b) {
        System.out.println("Iki double sayinin toplami : " + (a+b));
    }

    public static void topla(int sayi1, double sayi2) {
        System.out.println("int ve double sayilarin toplami : " + (sayi1+sayi2));
    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("double ve int sayilarin toplami : " + (sayi1+sayi2));
    }
}
