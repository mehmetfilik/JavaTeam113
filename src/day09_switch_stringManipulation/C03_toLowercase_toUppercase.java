package day09_switch_stringManipulation;

import java.util.Locale;

public class C03_toLowercase_toUppercase {

    public static void main(String[] args) {

        String str = "Java Candir";

        //str'i buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase()); // Java Candir

        System.out.println(str); // Java Candir

        //String Manipulation yaptiktan sonra asil variable'a atama yapilmazsa
        //asil variable degismez

        str = str.toUpperCase(Locale.ENGLISH);

        System.out.println(str);

        //System.out.println(str.toLowerCase());

        //str'i turkce karakterleri goz onunde bulundurarak kucuk harfe cevir

        str = str.toLowerCase(Locale.forLanguageTag("TR"));

        System.out.println(str);




    }
}
