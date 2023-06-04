package day19_dersTekrari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03 {

    public static void main(String[] args) {

        // verilen bir array'den tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir hale donusturun


        int[] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        // bir tane bos list olusturalim
        // array'deki her bir elemani ele alalim
        // ele aldigimiz element list'te yoksa ekleyelim, varsa eklemeyelim
        // boylece benzersiz elementlerden olusan bir list olusturalim

        List<Integer> benzersiz = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!benzersiz.contains(arr[i])){
                benzersiz.add(arr[i]);
            }
        }
        System.out.println(benzersiz); // [3, 4, 5, 6, 2, 7]

        arr = new int[benzersiz.size()];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=benzersiz.get(i);
        }
        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 2, 7]

    }
}
