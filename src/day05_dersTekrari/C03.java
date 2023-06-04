package day05_dersTekrari;

public class C03 {
    public static void main(String[] args) {

        //Esitlikleri kontrol ediniz

        int a = 10;
        int b = 20;

        System.out.println(a == b); //false
        System.out.println(a == b - 10); //true

        boolean c;
        System.out.println(c = 20 == b); //true

        c = 20 * a == 10 * b;
        System.out.println(c); //true

        System.out.println("============");

        System.out.println(a != b); //true
        System.out.println(a != b - 10); //false

        System.out.println(c = 20 != b); //false

        c = 20 * a != 10 * b;
        System.out.println(c); //false

        System.out.println("============");

        System.out.println(a > b && b > 0); //false
        System.out.println(a <= b - 10 && a > b - 12); //true
        System.out.println(c = 20 >= b && a < 0); //false

        c = a >= b && 3 * a < 4 * b;
        System.out.println(c); //false

        System.out.println("============");

        System.out.println(a > b || b > 0); //true
        System.out.println(a <= b - 10 || a > b - 12); //true
        System.out.println(c = 20 >= b || a < 0); //true

        c = a >= b || 3 * a < 4 * b;
        System.out.println(c); //true




    }
}
