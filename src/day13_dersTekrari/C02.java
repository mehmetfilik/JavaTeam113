package day13_dersTekrari;

public class C02 {

    public static void main(String[] args) {

        // verdigimiz bir sayinin faktoryelini hesaplayip
        // sonucu bize donduren bir method olusturun

        System.out.println(FaktoryelHesaplamaMethodu(5));

    }

    public static int FaktoryelHesaplamaMethodu(int sayi){

        int faktoryel = 1;

        if (sayi>0){
            for (int i = 1; i <=sayi ; i++) {
                faktoryel *=i;
            }
        }

        return faktoryel;
    }

}
