package day05_dersTekrari;

public class C01 {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = " ";
        String s3 = "kolay";
        String s4 = "";

        int a = 3;
        int b = 4;
        //Asagida istenen Stringleri yazdirin
        // 12 Java kolay
        // 7 Java kolay
        // 34Java kolay
        // Java12kolay
        //Java34kolay
        //Java7kolay

        System.out.println(a*b + s2 + s1 + s2 + s3);
        System.out.println(a+b + s2 + s1 + s2 + s3);
        System.out.println(a+ s4 + b+ s1 + s2 + s3);
        System.out.println(s1 + (a*b) + s3);
        System.out.println(s1 + a+b  + s3);
        System.out.println(s1+ (a+b) + s3);



    }




}
