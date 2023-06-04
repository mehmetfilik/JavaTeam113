package day09_dersTekrari;

import java.util.Locale;

public class C03 {

    public static void main(String[] args) {

        //str'i buyuk harf olarak yazdirin
        String str = "Java candir";
        System.out.println(str.toUpperCase());  //JAVA CANDİR

        str = str.toUpperCase(Locale.ENGLISH);
        System.out.println(str);                //JAVA CANDIR

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); //java candır




    }
}
