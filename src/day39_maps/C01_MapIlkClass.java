package day39_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapIlkClass {

    public static void main(String[] args) {

        Map<Integer,String> okulMap = new HashMap<>();
        /*
            bir maps olusturulurken ve element eklerken
            bilgilere sonradan erisimiin mumkun olabilmesi icin
            tum elementlerin ayni bilgileri barindirdigindan
            ve ayni siralama ile element'e eklendiginden emin omaliyiz
         */

        okulMap.put(101,"Ali, Cem, 10, H, MF");
        okulMap.put(102,"Veli, Can, 10, M, TM");
        okulMap.put(103,"Ali, Can, 11, M, MF");
        okulMap.put(104,"Ayse, Han, 11, H, TM");
        okulMap.put(105,"AYse, Cem, 10, H, MF");
        okulMap.put(106,"Veli, Han, 10, H, MF");

        System.out.println(okulMap);

        //map'te kac element var
        System.out.println(okulMap.size()); // 6

        // tum key'leri yazdiralim
        System.out.println(okulMap.keySet()); // [101, 102, 103, 104, 105, 106]

        //tum value'leri yazdiralim
        System.out.println(okulMap.values());

        // value collection icinde kac element vardir
        System.out.println(okulMap.values().size()); // 6

    }
}
