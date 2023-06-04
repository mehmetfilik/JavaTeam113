package day41_Collections;

import java.util.*;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
        Collections objeleri bir arada tutan yapilardir
        Gunluk hayatta karsilasilan durumlarla ilgili olusan ihtiyaclara gore farkli yapilari vardir
        Bir uygulamada hangi Collection'u kullanacagimiza ozelligine gore karar veririz

        3 ana Collection'dan bahsedebiliriz
            1- List
            2- Queue
            3- Set

        3 Interface ile kurallar belirleniyor.

        Interface'lerde obje olusturamadigimiz icin childClass'lardan constructer'lari kullaniriz
        Ozellikleri constructor'lar degil DATA TURU olarak sectigimiz collection belirler

         */
        //LinkedList : List, Queue ve Deque Interface'lerinin childClass'idir.
        LinkedList<String> Linked1 = new LinkedList<>();
        List<String> Linked2 = new LinkedList<>();
        Queue<String> Linked3 = new LinkedList<>();
        Deque<String> Linked4 = new LinkedList<>();


    }
}
