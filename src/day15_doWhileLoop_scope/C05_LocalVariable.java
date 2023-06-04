package day15_doWhileLoop_scope;

public class C05_LocalVariable {

    public static void main(String[] args) {

        /*
            1- bir method iceriinde olusturlan variable'in scope'u o method'dur
            baska bir method'da kullanilmaz
            bu variable'lara local variable denir.
            2-Her ne kadar bir method icinde olsalar da
            Loop'larin da ayri bir scop'u vardir
            Loop icersinde olusturulan variable'lar
            Loop disinda KULLANILAMAZLAR
            3-Local variable'lari deger atamadan olusturabiliriz
            ancak deger atamadan KULLANAMAYIZ
         */


        String isim = "Ali Can"; // Ali Can'in gecerli oldugu Scop Main Method.
        // Buyuzden baska Method'da calismaz
        //int sayi da baska Method'da kullanilamiyor

        //sayi++; Calismaz

        for (int i = 0; i <10 ; i++) {
            int j = i+1;

        }

        //System.out.println(i);

    }

    public static void baskamethod(){

        //System.out.println(isim); Calismaz

        int sayi = 5;

    }
}
