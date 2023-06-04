package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C01_ArtikYil {

    public static void main(String[] args) {
        //Soru ) Interview Question
        //Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        //Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        //Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        //Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int yil = scan.nextInt();

        if (yil %4 !=0) {
            System.out.println("Artik yil degil");
        } else if (yil %100 !=0) {
            System.out.println("Artik yil");
        } else if (yil %400 ==0) {
            System.out.println("Artik yil");
        } else {
            System.out.println("Artik yil degil");
        }

        /*
        Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048 vb.
Ancak bu kuralın iki istisnası vardır:
1. 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
Örneğin 1600 ve 2000 yılları artık yıldır ancak 1800 ve 1900 artık yıl değildir.
Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.[1]
2. Hesabı daha da hassas hâle getirmek için (400'e kalansız bölünebildiği halde) 4000'e kalansız olarak bölünebilen yıllar artık yıl kabul edilmez:[1]
Örneğin 4000, 8000, 12000, 16000, 24000, 32000, 48000, 64000 ve 96000 yılları 400'e tam bölünebildiği halde artık yıl kabul edilmeyecektir.[1
         */
    }
}
