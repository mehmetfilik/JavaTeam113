package day14_methodOverloading_whileLoop;

public class C01_AsalSayiYazdir {

    public static void main(String[] args) {

        //verilen pozitif bir tamsayinin
        //asal sayi olup olmadigini yazdiran bir method olusturun

        asalMiYazdir(2);
        asalMiYazdir(29);
    }

    public static void asalMiYazdir (int sayi) {

        int flag = 0;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i == 0) {
                flag++;
                break;
            }
        }

        if (flag ==0) {
            System.out.println("Girilen " + sayi + " sayisi asal sayidir.");
        } else
            System.out.println("Girilen " + sayi + " sayisi asal sayi degildir.");

    }


}
