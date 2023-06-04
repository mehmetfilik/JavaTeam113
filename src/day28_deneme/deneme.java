package day28_deneme;

import day28_accessModifier_encapsulation.C01;

public class deneme {

    public static void main(String[] args) {

        C01 obj = new C01();

        //obj.str = "Fava"; farkli package default access modifier
        //C01.s = "Fava"; farkli package default access modifier

        //obj.b = 10; farkli package private access modifier
        //obj.c = 10; farkli package private access modifier

        C01.a=10; // public access modifier
        obj.d=20; // public access modifier



    }
}
