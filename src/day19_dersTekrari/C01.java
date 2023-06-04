package day19_dersTekrari;

import java.util.Arrays;

public class C01 {

    public static void main(String[] args) {

        //Soru 2- Verilen 2 katli bir array'de
        //        ayni index'e sahip elementleri toplayip,
        //        yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.
        // input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        // output:                     [5, 7, 11]

        int[][] arr =  {{3,4,5}, {2,3,6,7},{2,3}};

        // ortak index kullanabilmek icin en kisa olani bulmaliyiz

        int enKisaArrLength = arr[0].length;

        for (int i = 0; i <arr.length ; i++) {
            if(enKisaArrLength<arr[i].length);{
                enKisaArrLength=arr[i].length;
            }
        }

        int[] toplamArr = new int[enKisaArrLength];
        int indextekiElementlerinToplami = 0;

        for (int i = 0; i <toplamArr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {

                indextekiElementlerinToplami += arr[i][j];
            }
            toplamArr[i] = indextekiElementlerinToplami;
            indextekiElementlerinToplami= 0;
        }
        System.out.println(Arrays.toString(toplamArr));

    }
}
