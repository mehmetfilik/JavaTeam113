package day44_maps_entrySet;

import java.util.Map;
import java.util.TreeMap;

public class C03_Compute {

    public static void main(String[] args) {

        // verilen bir String array’de her bir harfin kacar defa kullanildigini yazdirin
        // Ornek : String[] arr = {“A”,“C”,“B”,“N”,“A”,“N”,“A”}
        //              Output : A=3, B=1, C=1, N=2

        String[] arr = {"A","C","B","N","A","N","A"};

        Map<String,Integer> kullanimMiktarlari = new TreeMap<>();

        // contains() kullanarak yapalim

        // arr'deki her bir elementi ele alalim

        for (String each : arr
             ) {
            // eger ele aldigim element map'de yoksa
            // map'e element, 1 eklerim

            if (!kullanimMiktarlari.containsKey(each)){
                kullanimMiktarlari.put(each,1);
                // System.out.println(kullanimMiktarlari); {A=1, B=1, C=1, N=1}
            }else {
                // eger o element daha once map'te varsa
                // value'u 1 artirmamiz lazim

                int elementinEskiKullanimMiktari = kullanimMiktarlari.get(each);
                kullanimMiktarlari.put(each,elementinEskiKullanimMiktari+1);
            }
        }
        System.out.println(kullanimMiktarlari); // {A=3, B=1, C=1, N=2}

        // compute method'leri kullanarak da yapabiliriz

        Map<String,Integer> kullanim2 = new TreeMap<>();

        for (String eachHarf: arr
             ) {

            // eger o element daha once map'te varsa
            // value'u 1 artirmamiz lazim

            kullanim2.computeIfPresent(eachHarf,(k,v)->v+1); // bende key ve value var value'u 1 artir

            // eger ele aldigim element map'de yoksa
            // map'e element, 1 eklerim

            kullanim2.putIfAbsent(eachHarf,1); // {A=3, B=1, C=1, N=2}

        }

        System.out.println(kullanim2);
    }
}
