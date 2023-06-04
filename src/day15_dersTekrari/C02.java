package day15_dersTekrari;

public class C02 {

    public static void main(String[] args) {

        //verilen pozitif bir tamsayinin
        //rakamlar toplamini bize donduren method olusturun


        System.out.println(rakamlarToplami(123));

    }

    public static int rakamlarToplami(int sayi) {

        int rakamlarToplami = 0;
        int birlerBasamagi = 0;

        while (sayi > 0) {

            birlerBasamagi = sayi % 10;
            sayi /= 10;
            rakamlarToplami += birlerBasamagi;

        }
        return rakamlarToplami;

    }
}