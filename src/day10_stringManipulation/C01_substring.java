package day10_stringManipulation;

public class C01_substring {

    public static void main(String[] args) {

        String str = "Java ne kadar guzel";
        //substring 2 farkli sekilde kullanilabilir
        //1- tek parametre olursa, o index'den baslar sonuna kadar yazdirir
        System.out.println(str.substring(8)); //kadar guzel

        System.out.println(str.substring(0)); //Java ne kadar guzel

        System.out.println(str.substring(str.length() - 3)); //zel

        System.out.println(str.substring(str.length())); //hiclik

        //2- iki parametre girilirse baslangicIndex'inden baslar
        //  bitisIndex'ine kadar olan bolumu yazdirir

        System.out.println(str.substring(5, 7)); //ne
        //5. index'ten basla 7'ye kadar  yazdir ama 7'yi yazdirma
        //yani 5 ve 6. indexi yazdir

        System.out.println(str.substring(3, 4)); //a

        System.out.println(str.substring(0,1)); //a

        //str'in 5.index'deki karakterini yazdir
        System.out.println(str.charAt(5)); //n
        System.out.println(str.substring(5, 6)); //n

        System.out.println(str.substring(2, 2)); //hiclik

        //System.out.println(str.substring(5, 1)); //hata verdi. Run Time Error



    }
}
