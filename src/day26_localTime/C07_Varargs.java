package day26_localTime;

public class C07_Varargs {

    public static void main(String[] args) {

        // verilen 2 sayiyi toplayip yazdiran bir method olusturun

        topla(3,6); // 9

    }

    public static void topla(int a, int b){

        System.out.println(a+b);
    }
    public static void topla(int a, int b,int c){

        System.out.println(a+b+c);
    }
    public static void topla(int a, int b,int c,int d){

        System.out.println(a+b+c+d);
    }
}
