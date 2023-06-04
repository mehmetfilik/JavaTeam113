package day13_dersTekrari;

public class C04 {

    public static void main(String[] args) {

        //verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun

        System.out.println(CumleyiTersineCevirmeMethodu("Aleme bak"));

    }

    public static String CumleyiTersineCevirmeMethodu(String metin){

        String tersMetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin +=metin.substring(i,(i+1));

        }
        return tersMetin;

    }
}
