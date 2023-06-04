package day09_switch_stringManipulation;

public class C06_charAt {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(0)); // J

        //bastan 6. harfi yazdirin
        System.out.println(str.charAt(5));

        //sondan ikinci harfi yazdirin

        System.out.println(str.charAt(11-2)); // i

        //sondaki harfi yazdirin

        System.out.println(str.charAt(11-1)); // r

        //System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException
        //System.out.println(str.charAt(15)); // StringIndexOutOfBoundsException

        //str = 23;
        /*
        Java'da 2 turlu hata ile karsilasabiliriz
        1- syntax olarak hatali yazilan kodlari Java compile ederken anlar ve altini kirmizi cizer
            str = 23; yazarsaniz String bir variable'a int deger atanmayacagini bilir ve altini kirmizi cizer
            CompileTimeError (CTE) diyoruz

        2- Bazen de syntax'de hataolmaz
            Java sorunu calismaya basladiktan sonra farkeder
            str.charAt(15) : burada verilen str'dan bir karakter isteniyor
            compile time'da str'nin uzunlugunu Java anlamaz
            ama calisinca 15.indexin olmadigini fark eder ve exeption firlatir
            RunTimeError (RTE) deriz

         */




    }
}
