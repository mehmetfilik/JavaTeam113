package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C03_MDA {

    public static void main(String[] args) {

        int[][] arr = {{3, 4, 5}, {2, 3}, {1}};

        // int [][] iki katli array belirtir
        // ilk [] ana array'i (outerArray) kontrol eder
        // ikinci [] ise icerdeki array'leri (innerArray) kontrol eder

        System.out.println(arr[1][1]); //3

        System.out.println(arr[0][2]); //5

        System.out.println(arr[2].length); //1
        System.out.println(arr[1].length); //2

        System.out.println(arr[1]); //[I@58ceff1

        System.out.println(Arrays.toString(arr[1])); // [2, 3]

        System.out.println(Arrays.toString(arr)); // [[I@7c30a502, [I@58ceff1, [I@49e4cb85]

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [2, 3], [1]]

        System.out.println(arr.length); // 3

        System.out.println();

    }
}
