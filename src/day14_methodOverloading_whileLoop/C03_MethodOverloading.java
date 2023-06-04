package day14_methodOverloading_whileLoop;

public class C03_MethodOverloading {

    public static void main(String[] args) {

        /*
            Bir Class'da ayni isme sahip farkli islem yapan methodlar olabilir
            Java bu methodlardan hangisinin calisacagina
            parametrelere gore karar verir
            Bir Class'da ismi ayni parametreleri farkli methodlar olmasina
            Method OVERLOADING denir.
         */

        String str = "Bu is olacak";

        System.out.println(str.replace("Bu is", "Java guzel")); // Java guzel olacak

        System.out.println(str.replace('u', 'e')); // Be is olacak

    }
}
