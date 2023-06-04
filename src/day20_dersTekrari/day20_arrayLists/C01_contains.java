package day20_dersTekrari.day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {

    public static void main(String[] args) {

        // uzun bir Listeyi java'da List olarak kaydetmek istersek
        //  tek tek eklemek istemezseniz pratik olarak bir array olusturup
        // loop ile tum elementleri List'e ekleyebiliriz

        int[] arr = {2,3,5,4,3,6,7,4,5,6,7,3,4,2,1};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 5, 4, 3, 6, 7, 4, 5, 6, 7, 3, 4, 2, 1]

        // Listede element olarak 3 var mi ?

        System.out.println(sayilar.contains(3)); // true
        System.out.println(sayilar.contains(9)); // false

        sayilar.clear();

        System.out.println(sayilar); // []


    }
}
