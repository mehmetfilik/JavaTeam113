package day14_methodOverloading_whileLoop;

public class C02_isAsal {

    public static void main(String[] args) {
        //verilen birden buyuk bir tamsayi icin
        //sayi asil ise true
        //sayi asal degilse false dönen bir method olusturun

        System.out.println(isAsal(2));
        System.out.println(isAsal(23));

        boolean sonuc = isAsal(57);
        System.out.println(sonuc);

    }

    public static boolean isAsal(int sayi) {

        int flag = 0;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i == 0) {
                flag++;
                break;
            }
        }

        if (flag ==0) {

            return true;
        } else

        return  false;

    }


}
