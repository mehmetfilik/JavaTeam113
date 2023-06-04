package day39_maps;

import com.sun.source.doctree.SeeTree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {

    public static Map<Integer,String> ornekMapOlustur() {

        Map<Integer, String> okulMap = new HashMap<>();

        okulMap.put(101, "Ali-Cem-10-H-MF");
        okulMap.put(102, "Veli-Can-10-M-TM");
        okulMap.put(103, "Ali-Can-11-M-MF");
        okulMap.put(104, "Ayse-Han-11-H-TM");
        okulMap.put(105, "AYse-Cem-10-H-MF");
        okulMap.put(106, "Veli-Han-10-H-MF");

        return okulMap;
    }

    public static void subeOgrenciListesiYazdir(Map<Integer,String> okulMap, String istenenSube){
        /*
            1- value'leri ayri bir collection olarak kaydedelim
            2- her bir value'yu split ile array'e donusturelim
            3- array'den sube'yi kontrol edip
            eger istenen sube ise ogrencinin sinif isim ve soyismini yazdiralim
         */

        Collection<String> valueCollection = okulMap.values();

        System.out.println("=======Sube Listesi=======");
        System.out.println("Sira Sinif Isim Soyisim");
        int siraNo=1;

        for (String eachValue: valueCollection
             ) {
            String[] valueArr = eachValue.split("-");

            if (valueArr[3].equalsIgnoreCase(istenenSube)){

                System.out.println(siraNo+ "- "+valueArr[2]+", "+valueArr[0]+", "+valueArr[1]);
                siraNo++;
            }
        }


    }

    public static Map<Integer, String> topluSubeDegistirme(Map<Integer, String> okulMap, String eskiSube, String yeniSube) {

        // 1- once value'leri bir Set olarak kaydedelim
        Set<Integer> okulKeySeti = okulMap.keySet();

        for (Integer eachKey: okulKeySeti
             ) {
            // 2- herbir key'e ait value'yu split ile array'e donusturelim
            String[] valueArr = okulMap.get(eachKey).split("-");

            if (valueArr[3].equalsIgnoreCase(eskiSube)){
                valueArr[3] = yeniSube;

            }
            // 3- sube bilgisi eskiSube olanlari yeniSube yapalim
            // 4- array'deki bilgileri birlestirerek yeniden map'e ekleyelim

            String yeniValue = "";
            for (int i = 0; i < valueArr.length-1; i++) {

                yeniValue += valueArr[i] + "-";
            }
            yeniValue += valueArr[valueArr.length-1];
            okulMap.put(eachKey,yeniValue);
        }


        // 5- okulMap'inin son halini return edelim
        return  okulMap;


    }

    public static Map<Integer, String> yilSonuSiniflariDegistir(Map<Integer, String> okulMap) {

        // 1- key'leri bir set olarak kaydedelim
        Set<Integer> keySeti = okulMap.keySet();
        // 2- set'teki her bir key'e ait value'yu for-each-loop ile ele alalim
        for (Integer eachKey:keySeti
             ) {

            // 3- her key'e ait value'yu split() ile ayirip array olarak kaydedelim
            String[] valueArr = okulMap.get(eachKey).split("-"); // [Ali, Cem, 10, H, MF]
            // 4- array olarak kaydettigimiz bilgilerde istenen update'i yapalim

            if (valueArr[2].equalsIgnoreCase("12")){
                valueArr[2] = "Mezun";
            }else{ // "9" "10" "11"

                int sinif = Integer.parseInt(valueArr[2]);
                sinif++;

                valueArr[2] = sinif+"";
            }// [Ali, Cem, 11, H, MF]

            // 5- array'in yeni halini String olarak birlestirip yeniValue elde edelim

            String yeniValue = "";

            for (int i = 0; i < valueArr.length-1 ; i++) {
                yeniValue += valueArr[i]+"-";
            }

            yeniValue += valueArr[valueArr.length-1];

            // 6- her bir key ve yeniValue'yu map'a ekleyerek map'i update edelim

            okulMap.put(eachKey,yeniValue);

        }

        // 7- map'in yeni halini return edelim

        return  okulMap;
    }

    public static Map<Integer, String> numaraIleSoyisimDegistir(Map<Integer,String> okulMap, int okulNo, String yeniSoyisim) {
    // 1- istenen value'u alalim
        String istenenOgrenciValue = okulMap.get(okulNo);

        // 2- value uzerinde islem yapmak icin Split ile array'e kaydedelim
        String[] valueArr = istenenOgrenciValue.split("-");

        // 3- valueArr uzerinde istenen islemi yap
        valueArr[1] = yeniSoyisim;

        // 4- array'de degisiklik yapildiysa map'i update etmemiz gerekir
        // bunun ivcin de array'i yeniden value yapsiina uygun sekilde String'e donusturmeliyiz

        String yeniValue = valueArr[0]+"-"+valueArr[1]+"-"+
                            valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

        // 5- update edilmis yeni value'yu, key kullanarak map'e ekleyelim

        okulMap.put(okulNo,yeniValue);

        return okulMap;
    }

    public static void sinifaGoreListeYazdir(Map<Integer, String> okulMap, int istenenSinif) {

        // 1- okulMap'deki entry'leri kaydedelim
        Set<Map.Entry<Integer,String>> okulEntrySeti = okulMap.entrySet();

        // 2- Her bir entry'i ele alip, istenen islemi yaptiralim
        for (Map.Entry<Integer,String> eachEntry : okulEntrySeti
             ) {
            /*
        101=Ali-Cem-10-H-MF
        102=Veli-Can-10-M-TM
        103=Ali-Can-11-M-MF
        104=Ayse-Han-11-H-TM
        105=AYse-Cem-10-H-MF
        106=Veli-Han-10-H-MF
         */



            String value = eachEntry.getValue(); // Ali-Cem-10-H-MF
            String[] valueArr = value.split("-"); // [Ali, Cem, 10, H, MF]

            if (valueArr[2].equals(istenenSinif+"")){

                // no,
                System.out.print(eachEntry.getKey()+" ");
                // isim, soyisim, bolum
                System.out.print(valueArr[0] + " " + valueArr[1] + " " + valueArr[4]);
                System.out.println("");
            }


        }


    }

    public static Map<Integer, String> soyisimleriBuyukYap(Map<Integer, String> okulMap) {
        // Entry'ler ile cozelim
        Set<Map.Entry<Integer,String>> okulEntrySeti = okulMap.entrySet();
        // her bir Entry'i elden gecirip sadece oyisimleri buyuk harf yapalim

        for (Map.Entry<Integer,String> eachEntry : okulEntrySeti
             ) {
            // her bir entry'deki value'u alalim
            String value = eachEntry.getValue(); // Ali-Cem-10-H-MF

            // value'u array'e cevirelim
            String[] valueArr = value.split("-");

            // array'de sayismi buyuk harf yapalim
            valueArr[1] = valueArr[1].toUpperCase(); // [Ali, CEM, 10, H, MF]

            eachEntry.setValue(valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" + valueArr[4] + "-");


        }
        return okulMap;
    }
}
