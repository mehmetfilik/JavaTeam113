package day02_dataTurleri_Scanner;

public class C03_NonPrimitiveDataTurleri {

    public static void main(String[] args) {

        String isim="Ali Can";

        String ilkHarf="K";

        char ilkHarf2='m';
        /*ikisi de olur. Ama tek bir karakter icin gecerli.
        Farki ne?
        Primitive Data Rurundeki Variable lar sadece deger tasiyabilir.
        Ama NonPrimitive Data Turundeki Variable larin hem deger hem de method'lari olur.

         */

        System.out.println(ilkHarf.toLowerCase());
        System.out.println(ilkHarf2);

        String metin = "fhgfhjfgfhgfhgfhgfhgfjhgfhgfhg"+
                "jhffgougiugiugiougiuggoig"+
                "hjffiffztftfztfztfztftf";
        //hepsini bir metin olarak gorur.

        String not = "not";
        String Not = "Variable isimleri buyuk harfle baslanmasi tavsiye edilmez ama java kabul eder";
        String nOT = "Bir kere deklare edilen Variable tekrar declare edilmez";
        String noT = "ama isimler farkli yazildigi icin java bunlari farkli variable olarak kabul eder";
        //Variable isimlerinde harf, rakam, _ ve $ kullanilabilir.
        //Variable isimleri harf ile baslamalidir. rakam ile baslayamaz.

        //int int=10; kabul etmez.
        //int short=10; kabul etmez.

        /*Variable isimleri kucuk harfle baslar sonraki kelimeler bitisik yazilir ve ilk harfi buyuk olur.
        camelCase, ilkHarf, okulDefteri,
        buna isimlendirme gelenegi denir. naming convention
                 */





    }


}
