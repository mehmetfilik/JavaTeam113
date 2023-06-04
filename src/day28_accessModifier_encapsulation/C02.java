package day28_accessModifier_encapsulation;

public class C02 {

    public static void main(String[] args) {

        C01 obj =new C01();
        System.out.println(C01.a); //public
        //System.out.println(obj.b); access modifier private
        //System.out.println(C01.c); access modifier private

        obj.str = "tava";
        C01.s = "Tava";

        C01.a=10; // public access modifier
        obj.d=20; // public access modifier
    }
}
