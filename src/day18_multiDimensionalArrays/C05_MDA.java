package day18_multiDimensionalArrays;

public class C05_MDA {

    public static void main(String[] args) {

        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        // toplam element sayisi kactir

        int toplamElementSayisi = 0;

        for (int i = 0; i <arr.length ; i++) {

            toplamElementSayisi += arr[i].length;
        }
        System.out.println("Toplam element sayisi : " + toplamElementSayisi);

        // tum elementlerin toplamini bulun
        // MDA'lede her bir elementi elden gecirmek istiyorsak
        // kat sayisi kadar nested for-loop kullaniriz

        int elementlerinToplami = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                elementlerinToplami += arr[i][j];
            }
        }
        System.out.println("Elementlerin toplami : " + elementlerinToplami);


    }
}
