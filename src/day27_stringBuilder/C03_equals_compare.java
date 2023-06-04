package day27_stringBuilder;

public class C03_equals_compare {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");
        String str = "java";

        //System.out.println(sb1 == str);
        // Java'da farkli data turune sahip non-primitive objeler == ile KARSILASTIRILAMAZ

        System.out.println(sb1 == sb2); // false
        System.out.println(sb1 == sb1); // true
        System.out.println(sb1.equals(sb2)); // false
        // StringBuilder'da icerik ayni olsa bile equals methodu false doner
        //

        System.out.println(sb1.equals(str)); // false

        StringBuilder sb3 = new StringBuilder("hava");
        StringBuilder sb4 = new StringBuilder("tava");

        System.out.println(sb1.compareTo(sb2)); // 0 = problem yok
        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); // -10
        System.out.println(sb3.compareTo(sb2)); // -2




    }
}
