package day25_passByValue_ImmutableClasses;

public class C03_ImmutableClasses {

    public static void main(String[] args) {
        /*
            java'da bir class ve o class'dan olusturulan objeler
            ya mutable ya da immutable'dir.

            Java metinsel ifadeleri atayabilecegimiz 3 class olusturmustur
            String --- immutable
            StringBuilder --- mutable
            StringBuffer --- mutable

            Immutable bir class'dan olusturulan objeler de Immutable'dir
            String Immutable oldugundan ayni str objesine yeni deger atandiginda Java eski degeri DEGISTIREMEZ
            bunu yerine istenen yeni degere sahip yeni bir obje olusturur
            ve str'in pointer'ini yeni objeye yoneltir

            kullanilmayan eski objeler
            Garbage Collector tarafindan toplanmak uzere beklerler
         */

        String str = "Java candir";

        str = str.toLowerCase();

        System.out.println(str); // java candir

        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDİR

        //Asagidaki kod calistiginda
        //Java kac obje olusturur

        String s = "Hava";

        for (int i = 0; i <100 ; i++) {
            s=s+".";
        }
        System.out.println(s); // Hava....................................................................................................



    }
}
