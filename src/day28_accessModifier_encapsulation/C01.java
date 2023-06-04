package day28_accessModifier_encapsulation;

public class C01 {
    String str; // class level'daki her class uyesinin access modifier'i olur
                // eger access modifier gorunmuyorsa Java o class uyesini default access modifier olarak isaretler

    static String s;

    public static int a;
    private int b;
    private static int c;

    public int d;


    public static void main(String[] args) {

        int sayi = 10;
        //public int sayi2 =20;
        //static String b;
        // Bir method icerisinde public, protected, private gibi access mosifier'lar
        // veya static keyword KULLANILAMAZ---bunlar class level'deki variable'lar ve methodlar icin gecerli

        //System.out.println(b); static degil
        System.out.println(c);

        //str="Java"; static degil
        s="hava";

        a=10;
        //d=20; static degil

    }

    void  method1(){
        System.out.println(b);
        System.out.println(c);

        str="Java";
        s="hava";

        a=10;
        d=20;
    }

    static void method2(){
        //System.out.println(b); static degil
        System.out.println(c);

        a=10;
        //d=20; static degil
    }

    public void method3(){
        System.out.println(b);
        System.out.println(c);

        a=10;
        d=20;
    }



}
