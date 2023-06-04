package day44_maps_entrySet;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C02_EntrySet {

    public static void main(String[] args) {

        // verilen okulMap’indeki soyisimleri buyuk harfe cevirin.

        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();

        okulMap = MapMethodDepo.soyisimleriBuyukYap(okulMap);
        System.out.println(okulMap);
        // {101=Ali-CEM-10-H-MF-, 102=Veli-CAN-10-M-TM-, 103=Ali-CAN-11-M-MF-, 104=Ayse-HAN-11-H-TM-, 105=AYse-CEM-10-H-MF-, 106=Veli-HAN-10-H-MF-}

    }
}
