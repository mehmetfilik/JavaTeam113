package day17_dersTekrari;

import java.sql.Array;
import java.util.Arrays;

public class C06 {
    public static void main(String[] args) {

        //Verilen bir array'e istenen bir elementi ekleyip,
        //yeni halini bize donduren bir method olusturun

        int[] arr = {2,4,7,8};

        //arr'ye methodu kullanarak 5 ekleyin

        arr = elementEkle(arr,5);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] elementEkle(int[] arr, int sayi) {

        int[] yeniArr = new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i] = arr[i];
        }
        yeniArr[yeniArr.length-1] = sayi;


        return yeniArr;
    }
}
