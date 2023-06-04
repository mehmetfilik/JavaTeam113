package day44_maps_entrySet;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C01_EntrySet {

    public static void main(String[] args) {

        // istenen siniftaki ogrencilerin no, isim, soyisim, bolumlerini bir liste olarak yazdirin

        /*
            Daha önceki yöntemlerimizle yapacak olsak
            1- map'taki tüm key'leri okulMap.keySet() methodu'yla  elde edip bir Set'e kaydederiz
                [101, 102, 103, 104, 105, 106]
            2- for-each loop ile her bir key'e ait value'yu aliriz "Ali-Cem-10-H-MF"
                - value.split() ile value'yu bir array'e cevirip kaydederiz [Ali, Cem, 10, H, MF]
                - bu array'de sinifi kontrol edip, eger istenen sinifa esit ise
                - key ve value array'inden istenen bilgileri yazdiririz

            Java key ve value degerleri birlikte kullanilabilsin ve gerekirse
            value update edilebilsin diye Entry interface'ini olusturmustur

         */

        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();

        System.out.println(okulMap);
        /*{101=Ali-Cem-10-H-MF,
        102=Veli-Can-10-M-TM,
        103=Ali-Can-11-M-MF,
        104=Ayse-Han-11-H-TM,
        105=AYse-Cem-10-H-MF,
        106=Veli-Han-10-H-MF}

         */
        /*
        101=Ali-Cem-10-H-MF
        102=Veli-Can-10-M-TM
        103=Ali-Can-11-M-MF
        104=Ayse-Han-11-H-TM
        105=AYse-Cem-10-H-MF
        106=Veli-Han-10-H-MF
         */

        MapMethodDepo.sinifaGoreListeYazdir(okulMap,10);
        // 101 Ali Cem MF
        //102 Veli Can TM
        //105 AYse Cem MF
        //106 Veli Han MF


    }
}
