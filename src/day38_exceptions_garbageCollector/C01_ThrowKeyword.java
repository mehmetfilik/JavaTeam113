package day38_exceptions_garbageCollector;

public class C01_ThrowKeyword {

    public static void main(String[] args) {

        // sayi 0'dan kucukse sartli satirlar calismasin

        try {
            int sayi = 10;

            if (sayi<0){
                throw new IllegalArgumentException("Sayi negatif olmamali");
            }

            System.out.println("sartli calisacak satir1");
            System.out.println("sartli calisacak satir2");
            System.out.println("sartli calisacak satir3");
            System.out.println("sartli calisacak satir4");

        } catch (IllegalArgumentException e) {

        }


        System.out.println("yola devam");


    }
}
