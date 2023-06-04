package day21_arrayLists_forEachLoop;

public class C04_KarelerinToplami {

    public static void main(String[] args) {

        //Soru 2- Verilen int array’deki her elementin karelerini alip,
        //        karelerinin toplamini yazdiran bir method olusturun.

        int [] arr = {2,3,5,0,1};

        karelerToplaminiYazdirMethodu(arr); // Verilen Array'deki elementlerin kareleri toplami : 39

    }

    public static void karelerToplaminiYazdirMethodu(int[] arr){

        int karelerToplami = 0;

        for (int each: arr
             ) {
            karelerToplami += each*each;
        }
        System.out.println("Verilen Array'deki elementlerin kareleri toplami : " + karelerToplami);
    }
}
