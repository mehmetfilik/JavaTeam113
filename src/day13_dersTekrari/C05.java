package day13_dersTekrari;

import day13_methodOlusturma.C05_StringiTerseCevirme;

public class C05 {

    public static void main(String[] args) {

        //verilen bir String'in Palindrome olup olmadigini yazdirin
        //Palindrome : duzden ve tersten ayni sekilde yazilan
        //madam, 12321, kabak

        String str1 = "kabak";
        String str2=C05_StringiTerseCevirme.stringTersineCevir("kabak");

        if (str2.equalsIgnoreCase(str1)){
            System.out.println(str1 + " : Bir Palindrome");
        } else {
            System.out.println(str1 + ": Palindrome degil");
        }

    }
}
