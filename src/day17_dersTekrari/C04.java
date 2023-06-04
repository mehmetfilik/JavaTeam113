package day17_dersTekrari;

public class C04 {

    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr1 = {"Melike", "Burkay", "inci", "Eda", "Emre"};

        enUzunEnKisaYazdirma(arr1); //Melike, Eda

        String[] arr2 = {"Melike", "Burkay", "inci", "Eda", "Emre", "Huseyin", "Su"};

        enUzunEnKisaYazdirma(arr2); //Huseyin, Su
    }

    public static void enUzunEnKisaYazdirma(String[] arr1) {

        String enUzunKelime = arr1[0];
        String enKisaKelime = arr1[0];

        for (int i = 0; i < arr1.length ; i++) {

            if (arr1[i].length()>enUzunKelime.length()){
                enUzunKelime=arr1[i];
            }
            if (arr1[i].length()<enKisaKelime.length())
            enKisaKelime = arr1[i];
        }

        System.out.println("En uzun kelime = " + enUzunKelime);
        System.out.println("En kisa kelime = " + enKisaKelime);


    }
}
