package day41_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {

    public static void main(String[] args) {

        /*
        List data turunde bir LinkedList olusturun
         */

        List<String> harfler = new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        harfler.add("M");
        harfler.add("L");

        System.out.println(harfler); //[H, K, M, L]
        harfler.add("B");
        System.out.println(harfler); //[H, K, M, L, B]

        harfler.add(3,"T");
        System.out.println(harfler); //[H, K, M, T, L, B]

        harfler.set(3,"R");
        System.out.println(harfler); //[H, K, M, R, L, B]

        List<String> semboller = new LinkedList<>();

        semboller.add("*");
        semboller.add("B");
        semboller.add("%");
        semboller.add("&");

        System.out.println(semboller); // [*, B, %, &]
        System.out.println(harfler.retainAll(semboller)); // true
        System.out.println(semboller); // [*, B, %, &]
        System.out.println(harfler); // [B]
        harfler.addAll(semboller);
        System.out.println(harfler); // [B, *, B, %, &]
        harfler.removeAll(semboller);
        System.out.println(harfler); // []


    }
}
