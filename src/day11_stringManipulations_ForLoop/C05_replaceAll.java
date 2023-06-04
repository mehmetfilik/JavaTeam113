package day11_stringManipulations_ForLoop;

public class C05_replaceAll {

    public static void main(String[] args) {

        String str = "     J&ava54 C+an01dir,,,     ";

        //str'i Java Candir haline getirin

        str = str.trim(); //bastaki ve sondaki space'leri temizler

        str = str.replaceAll("\\d",""); //J&ava C+andir,,,

        System.out.println(str);

        str = str.replaceAll(" ","5"); //Java5Candir

        str = str.replaceAll("\\W",""); //JavaCandir

        str = str.replaceAll("5", " "); //Java Candir

        System.out.println(str);

        str = str.repeat(4); // yanyana tekrar tekrar yazar
        System.out.println(str);




    }
}
