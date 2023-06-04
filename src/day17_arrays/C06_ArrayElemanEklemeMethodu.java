package day17_arrays;

import java.util.Arrays;

public class C06_ArrayElemanEklemeMethodu {

    public static void main(String[] args) {

        //Verilen bir array'e istenen bir elementi ekleyip,
        //yeni halini bize donduren bir method olusturun

        int[] arr = {2,4,7,8};

        //arr'ye methodu kullanarak 5 ekleyin

        arr = arrayeElementEkle(arr,5);
        arr = arrayeElementEkle(arr,3);
        arr = arrayeElementEkle(arr,19);
        System.out.println(Arrays.toString(arr));


    }

    public static int[] arrayeElementEkle(int[] arr,int eklencekElement){

    int[] yeniArray = new int[arr.length+1]; // [0,0,0,0,0]

        for (int i = 0; i < arr.length ; i++) {

            yeniArray[i] = arr[i];
        } // yeniArr [2,4,7,8,0]

        yeniArray[yeniArray.length-1] = eklencekElement;

        return yeniArray;

    }

}
