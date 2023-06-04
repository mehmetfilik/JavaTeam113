package day21_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        // arr array'in elementlerini icerenbir arrayList olusturun

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println("sayilar listesi : " + sayilar); // sayilar listesi : [3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8]
        /*
                Java'da bir arrayi arrayList'e cevirmek icin kullanilan asList() vardir
                ancak kullanimi tavsiye edilmez
                cunku 2 buyuk dezavantaji vardir
                1- asList() kullanilarak array'den Liste cevrilen listelerde
                    ekleme silme gibi uzunlugu degistiren method'lar kullanilamaz

                2- arkaplanda array ve array'den donusturdugumuz list beraber hareket eder
                    birinde yaptigimiz uppdate'ler otekine de islenir
         */

        List<Integer> arraydenList = Arrays.asList(arr);
        System.out.println("Array'den List'e ceviren : " + arraydenList); // Array'den List'e ceviren : [3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8]

        // 2 list'e de 11 ekleyelim

        sayilar.add(11);
        //arraydenList.add(11);   UnsupportedOperationException
        System.out.println("sayilar listesi : " + sayilar); // sayilar listesi : [3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8, 11]
        System.out.println("Array'den List'e ceviren : " + arraydenList);

        // 2 list'in 0.indeydeki elementleri silelim

        sayilar.remove(0);
        //arraydenList.remove(0);  UnsupportedOperationException
        System.out.println("sayilar listesi : " + sayilar); // sayilar listesi : [5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8, 11]
        System.out.println("Array'den List'e ceviren : " + arraydenList);


        // 2.dezavantaj

        System.out.println("Array          : " +Arrays.toString(arr));
        System.out.println("Array'den List : " +arraydenList);

        // array'in bir elementine yeni deger atayalim

        arr[0]=22;

        System.out.println("===== array'i degistirdikten sonra=====");
        System.out.println("Array          : " +Arrays.toString(arr));
        System.out.println("Array'den List : " +arraydenList);

        // list'in bir elementini update edelim

        arraydenList.set(1,45);

        System.out.println("===== list'i degistirdikten sonra=====");
        System.out.println("Array          : " +Arrays.toString(arr));
        System.out.println("Array'den List : " +arraydenList);





    }
}
