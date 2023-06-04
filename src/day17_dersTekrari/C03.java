package day17_dersTekrari;

public class C03 {
    public static void main(String[] args) {

        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr1 = {2,4,5,2,6,4,7,3,5};
        String[] arr2 = {"E","H","M","H","H","E"};

        elemanSayisiYazdirma(arr1,2);
        elemanSayisiYazdirma(arr2,"E");
    }

    public static void elemanSayisiYazdirma(int[] arr,Object arananEleman) {

        int sayac=0;
        for (int i = 0; i < arr.length ; i++) {

            if (arananEleman.equals(arr[i])){
                sayac++;
            }

        }
        System.out.println(arananEleman+ " elementi " + sayac + " kere kullanilmistir.");

    }
    public static void elemanSayisiYazdirma(String[] arr,Object arananEleman) {

        int sayac=0;
        for (int i = 0; i < arr.length ; i++) {

            if (arananEleman.equals(arr[i])){
                sayac++;
            }

        }
        System.out.println(arananEleman+ " elementi " + sayac + " kere kullanilmistir.");

    }
}
