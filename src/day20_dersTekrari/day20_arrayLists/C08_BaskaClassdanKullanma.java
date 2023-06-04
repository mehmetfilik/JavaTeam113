package day20_dersTekrari.day20_arrayLists;

public class C08_BaskaClassdanKullanma {

    public static void main(String[] args) {

        // verilen sayinin pozitif tam bolenleri sayisi 10'dan cok ise "Guzel"
        // yoksa "Kotu" yazdirin

        int sayi = 100;

        //System.out.println(C07_TamBolenlerListesi.pozitifBolenleriListele(sayi));



        int pozitifTamBolenlerSayisi = C07_TamBolenlerListesi.pozitifBolenleriListele(sayi).size();
        //System.out.println(pozitifTamBolenlerSayisi);

        if (pozitifTamBolenlerSayisi>10){
            System.out.println("Guzel");
        } else{
            System.out.println("Kotu");
        }


    }
}
