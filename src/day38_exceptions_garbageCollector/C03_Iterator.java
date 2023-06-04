package day38_exceptions_garbageCollector;

import java.util.Arrays;

public class C03_Iterator {

    public static void main(String[] args) {

        int[] arr = {3,8,1,9,15};

        //tum elementleri yazdirin
        //for each loop

        for (int each:arr
             ) {
            System.out.print(each + "    ");
        }
        System.out.println("");

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i] + "    ");
        }
        System.out.println("");

        // Index kullanmadan tum elemntleri 3 artirip kaydedin
        // Index istenmedigi icin normal loop kullanamayiz
        // for each loop ile deneyelim

        for (int each:arr
             ) {



            each=each+3;
            System.out.print(each+" ");
        }

        System.out.println("");

        System.out.println(Arrays.toString(arr));

    }
}
