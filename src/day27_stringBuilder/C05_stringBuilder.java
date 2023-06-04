package day27_stringBuilder;

public class C05_stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.delete(4,5)); // JavaCandir

        System.out.println(sb1); // JavaCandir

        System.out.println(sb1.deleteCharAt(9)); // JavaCandi

        System.out.println(sb1); // JavaCandi

        System.out.println(sb1.insert(9, "r")); // JavaCandir

        System.out.println(sb1); // JavaCandir

        System.out.println(sb1.insert(4, " ")); // Java Candir

        System.out.println(sb1); // Java Candir

        String str = " can bize gelecekmis";

        System.out.println(sb1.insert(11, str, 0, 5)); // Java Candir can

        sb1.replace(12,15,"Can.");

        System.out.println(sb1); // Java Candir Can.
        System.out.println(sb1.append(str, 2, 4));
        System.out.println(sb1.subSequence(2, 4));
        System.out.println(sb1.deleteCharAt(3));


    }
}
