package day20_dersTekrari.day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturmak {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip
        // Q'ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun

        System.out.println(kullaniciyaListOlusturma());
    }

    public static List<String> kullaniciyaListOlusturma(){

        List<String> isimler = new ArrayList<>();
        String girilenisim = "";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Listeye eklemek icin bir isim giriniz"+
                    "\nBitirmek icin Q'ya basin");
            girilenisim = scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);
            }

        }while (!girilenisim.equalsIgnoreCase("Q"));

        return isimler;



    }

}
