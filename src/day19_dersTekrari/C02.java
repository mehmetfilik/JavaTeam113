package day19_dersTekrari;

import java.util.ArrayList;
import java.util.List;

public class C02 {
    public static void main(String[] args) {

        /*
               ArrayList, uzunlugu esnek bir listedir
               Array altyapisini kullanir ancak ekleme ve silme gibi islemlerde daha avantajlidir

               ArrayList'in tek dezavantaji var
               o da elementleri tek tek eklememiz gerekmesi
         */

        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        System.out.println(arr);
        arr.remove("b");
        System.out.println(arr);


    }
}
