package day15_doWhileLoop_scope;

public class C06_ClassLevelVariable {

    /*
        Bir class icinde tum methodlarin erisebilecegi variable'lar istenirse
        Class Level'da (Class'in icinde ama Method'larin disinda) olusturulmalidir

        1- Class Level'da olusturulan variable'larin scop'u tum class'tir
        2- Class Level'da olusturulan variable'lara deger atanmasa bile
        Java onlar icin tanimlanmis DEFAULT DEGERLER atar
        3- Class Level'da olusturulan variable'lar static veya instance(static olmayan) olabilir
        4- static olarak tanimlanan variable'lar tum method'larda direkt kullanilabilir
        5- method static ise, icine static olmayan hicbirsey (variable, method call) almaz
     */

    static int sayi = 10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;
    int in2;
    boolean bl2;

    public static void main(String[] args) {
        System.out.println(sayi);
        System.out.println("String : " + isim); // non-primitive turler icin null
        System.out.println("boolean : " + bl); // false
        System.out.println("char : " + chr); // '' hiclik
        System.out.println("int : " + in1); // sayisal turler icin 0

        //System.out.println(in2); instance
        staticMethod();
        //staticOlmayanMethod();

    }

    public static void staticMethod(){
        sayi++;
        System.out.println(sayi); // static
        //System.out.println(in2);  instance
    }

    public void staticOlmayanMethod(){
        sayi--;
        System.out.println(sayi); // static
        System.out.println(in2); // instance
    }
}
