package day17_arrays;

public class C03_EnUzunElementiYazdir {

    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr1 = {"Melike", "Burkay", "inci", "Eda", "Emre"};

        enUzunEnKisaYazdir(arr1); //Melike, Eda

        String[] arr2 = {"Melike", "Burkay", "inci", "Eda", "Emre", "Huseyin", "Su"};

        enUzunEnKisaYazdir(arr2); //Huseyin, Su


    }

    public static void enUzunEnKisaYazdir(String[] arr){
        String enUzunKelime = arr[0]; //uzunluk 0
        String enKisaKelime = arr[0]; //uzunluk 0

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length()>enUzunKelime.length()){
                enUzunKelime = arr[i];
            }
            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime = arr[i];
            }

        }

        System.out.println("array'daki en uzun kelime : " + enUzunKelime);
        System.out.println("array'daki en kisa kelime : " + enKisaKelime);

    }

}
