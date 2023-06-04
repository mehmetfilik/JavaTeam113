package day11_stringManipulations_ForLoop;

public class C02_nullPointer {

    public static void main(String[] args) {

        //null bir deger degildir
        //null bir pointer'dir
        //yanina yazildigi non-primitive variable'a deger atanmadigini isaret eder

        String str; // str olusturuldu ama deger atanmadi

        //java method icerisinde deger atamadan variable olusturulmasina izin verir
        //ama deger atamadan kullanilmasina izin vermez

        //System.out.println(str);  CTE
        //str.concat("Java");  CTE

        //bazen programlarda variable'lar olusturulur ama
        //daha sonra deger atanacagi icin deger atamasi yapilmaz
        //deger atamasi yapilmadan listeleme bile CTE verdigi icin
        //deger verilmedigini isaretleyecek ama CTE olusmasini engelleyecek
        //bir cozum olarak null pointer olusturulmustur

        str=null;   //str="null" degil
                    // null olarak isaretlenmis olsa da degeri null atanmis degil

        System.out.println(str);

        //System.out.println(str.concat("Java")); //Run Time Error - NullPointerException

        //System.out.println(str.length()); //Run Time Error - NullPointerException

        System.out.println(str+"Java"); //nullJava

        String str2 = str+"Java";
        System.out.println(str2); //nullJava

        //int sayi = null;
        Integer sayi = null;

        // biz genelde String bir ifade olusturup sonra deger atayacaksak
        // hiclik degeri atariz

        String str3 = ""; // buna birdeger atanmistir. hiclik degeri atanmis

        System.out.println(str3.concat("Java"));

        //System.out.println(str.isEmpty()); //Run Time Error - NullPointerException
        //null olarak isaretlenen bir String HIC BIR METHOD'LA kullanilamaz
        //sadce yazdirilabilir veya + ile kullanilabilir

        System.out.println(str3.isEmpty()); //true



    }
}
