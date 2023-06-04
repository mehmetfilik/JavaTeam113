package day08_nestedIfElse_ternary;

public class C06_Ternary {
    public static void main(String[] args) {

        //ternary operatru ya direkt sout icerisinde kullanilir
        //veya bir degiskene atama yapacak sekilde yazilir

        int sayi = 20;

        //sayi%2==0 ? "cift sayi" : "tek sayi" bu sekilde java hata verir

        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
        String sonuc = sayi%2==0 ? "cift sayi" : "tek sayi";

        //eger true oldugundaki sonuc ile false oldugundaki sonuc
        //farkli data turlerinde olursa yazdirilabilir ama atama yapamaz

        //sayi cift ise "cift sayi"
        //degilse sayinin 2 katini yazdirin

        System.out.println(sayi%2==0 ? "cift sayi" : 2*sayi);





    }
}
