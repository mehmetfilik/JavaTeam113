package day17_dersTekrari;

import java.util.Arrays;

public class C02 {

    //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip
    // bize donduren bir method olusturun.
    // Eski array’i yeni haliyle kaydedin.

    static int[] arr= {3,4,5,6};

    public static void main(String[] args) {

        arr = ArrayElemanlariniIkiArtir(arr,2);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] ArrayElemanlariniIkiArtir(int[] arr, int artis) {

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += artis;

        }
        return arr;

    }

}
