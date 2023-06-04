package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_Mutable_ImmutableClasses {

    public static void main(String[] args) {

        /*
            String ve Wrapper class'lar Immutable olduklari icin degistirilemezler
            Ancak Array ve List Mutable olduklari icin
            atama yapmasak da method kullaninca degerleri degisir.
         */

        String str = "Java gün gectikce daha da keyifli oluyor";

        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        str.toLowerCase();

        System.out.println(str); // Java gün gectikce daha da keyifli oluyor

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(8);

        System.out.println(sayilar); // [5, 8]

        sayilar.set(0,7);
        sayilar.remove(1);

        System.out.println(sayilar); // [7]



    }
}
