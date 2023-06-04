package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C01_Update {

    public static void main(String[] args) {

        // verilen map'te sube ismi M olanlarin
        // subesini N yapin

        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        // {101=Ali-Cem-10-H-MF,
        // 102=Veli-Can-10-M-TM,
        // 103=Ali-Can-11-M-MF,
        // 104=Ayse-Han-11-H-TM,
        // 105=AYse-Cem-10-H-MF,
        // 106=Veli-Han-10-H-MF}

        System.out.println(okulMap.get(101)); // Ali-Cem-10-H-MF
        okulMap.put(101,"Ali-Cem-10-M-MF");
        System.out.println(okulMap.get(101)); // Ali-Cem-10-M-MF
        okulMap.put(102,"Kemal-Can-11-M-Soz");
        System.out.println(okulMap.get(102)); // Kemal-Can-11-M-Soz

        // 1- once value'leri bir Set olarak kaydedelim
        // 2- herbir key'e ait value'yu split ile array'e donusturelim
        // 3- sube bilgisi eskiSube olanlari yeniSube yapalim
        // 4- array'deki bilgileri birlestirerek yeniden map'e ekleyelim
        // 5- okulMap'inin son halini return edelim


        // 6- return edilen yeni halini eski okulMap'e assign edelim
        okulMap = MapMethodDepo.topluSubeDegistirme(okulMap,"H","K");

        System.out.println(okulMap);



    }
}
