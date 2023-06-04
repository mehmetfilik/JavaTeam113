package day45_maps_THE_END;

import java.util.TreeMap;

public class C01_TreeMapMethodlari {

    public static void main(String[] args) {

        TreeMap<String,Integer> deneme = new TreeMap<>();

        deneme.put("F",20);
        deneme.put("T",30);
        deneme.put("A",10);
        deneme.put("M",25);
        deneme.put("Z",30);

        System.out.println(deneme); // {A=10, F=20, M=25, T=30, Z=30}

        System.out.println(deneme.tailMap("F")); // {F=20, M=25, T=30, Z=30}

        System.out.println(deneme.tailMap("C")); // {F=20, M=25, T=30, Z=30}

        System.out.println(deneme.tailMap("G")); // {M=25, T=30, Z=30}

        // varsa verilen key'den baslayip sona kadar yazar
        // verilen key yoksa, olsaydi nerde olurdu bulup, sonrasini döndürür

        System.out.println(deneme.tailMap("M",false)); // {T=30, Z=30} "M" yi dahil etmedi
        // javada baslangic degerleri inclusive'dir, eger tail alirken
        // verdigimiz baslangic key'in dahil olmaisni istmezsek false yazariz

        System.out.println(deneme.headMap("M")); // {A=10, F=20}
        System.out.println(deneme.headMap("N")); // {A=10, F=20, M=25}
        System.out.println(deneme.headMap("T",true)); // {A=10, F=20, M=25, T=30}
        // javada biti degerleri exclusive'dir eger head alirken
        // verdigimiz bitis key dahil olsun istersek true yazariz

        System.out.println(deneme.pollLastEntry()); // Z=30
        System.out.println(deneme); // {A=10, F=20, M=25, T=30}

        System.out.println(deneme.pollFirstEntry()); // A=10
        System.out.println(deneme); // {F=20, M=25, T=30}

        System.out.println(deneme.higherKey("M")); // T
        System.out.println(deneme.higherKey("C")); // F
        System.out.println(deneme.higherEntry("F")); // M=25
        // verdigimiz key'den buyuk olan ilk key/entry döner

        System.out.println(deneme.lowerKey("M")); // F
        System.out.println(deneme.lowerKey("C")); // null
        System.out.println(deneme.lowerEntry("M")); // F=20
        // verdigimiz key'den kucuk olan ilk key/entry döner

        System.out.println(deneme.floorKey("M")); // M
        System.out.println(deneme.floorEntry("M")); // M=25
        // kucuk esittir anlaminda, varsa kendisini yoksa ondan oncekini döndürür

        System.out.println(deneme.ceilingKey("T")); // T
        System.out.println(deneme.ceilingEntry("K")); // M=25
        // buyuk esittir anlaminda, varsa kendisini yoksa ondan sonrakini döndürür

        System.out.println(deneme.descendingMap()); // {T=30, M=25, F=20}

        System.out.println(deneme.subMap("K", "O")); // {M=25}

        System.out.println(deneme.subMap("F", "O")); // {F=20, M=25}
        System.out.println(deneme.subMap("F", "M")); // {F=20} bitis exclusive oldugu icin "M" dahil olmadi






    }
}
