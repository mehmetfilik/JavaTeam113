package day02_dataTurleri_Scanner;

public class C02_DataTurleri {

    public static void main(String[] args) {

        char ilkHarf= 'a';//tek tirnak icinde tek karakter (harf, sayi, ozel karakter...)


        byte ogrYasi1=15;//en dogru kullanim bu olur
        //hafiza kullanimini optimize etmek icin bu yeterlidir.

        short ogYasi2=16;
        int ogrYasi3=14;
        long ogrYasi4=15;

        double sayi1=3.1234567890123456789;//double in hata payi var.
       // vigulden sonra 16 hane yazdirir. Artik cok kücük sayilara indigi icin ondalikli kismin sonunda hatalar olabilir.

        System.out.println(sayi1);//3.1234567890123457

        float sayi2=45.34534534534534534543534534534353f;
        //float sayi tanimladigimizda double dan farkini belirtmek icin degerin sonuna f veya F yazmak zorundayiz.

        System.out.println(sayi2);//45.345345

        /*biz dersler boyunca hafiza onemli olmadigi icin
        tamsayilarda int
        ondaliklilarda double kullanacagiz.
         */







    }
}
