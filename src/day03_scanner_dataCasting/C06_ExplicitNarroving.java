package day03_scanner_dataCasting;

public class C06_ExplicitNarroving {

    public static void main(String[] args) {

        double db1 = 45.32;

        int in1 = (int)db1;  // int <=== double

        System.out.println(in1);  // 45 (ondalikli kismi atti)

        db1 = 3987876765d;  // büyük bir sayi oldugu ve double oldugundan emin olmak icin sonuna d yazabiliriz

        in1 = (int)db1; // int <=== double

        System.out.println(in1); //2147483647

        in1 = 34;
        //byte by1 = in1; // short bir variable a int atamaya calisiyorsun
        byte by1 = (byte)in1; //yine de cevir diyoruz
        // -128 ----- 127

        System.out.println(by1); // 34

        in1=130; // 127 den sonra bir adim gitse -128e gelir. 130 verdigimiz icin -126a gelir.
        //her 256da sifirlanir.

        by1 = (byte)in1 ;

        System.out.println(by1); // -126





    }

}
