package day22_constructor;

public class C06_Araba {

    /*
           Bir obje olusturulurken
           default constructor veya parametresiz gorunur constructorkullanilirsa
           obje ilk atanan degerlere sahip olur
           istedigimiz degerleri atamak icin tek tek tum variable'lara
           atama yapmamiz gerekir

           Bunun yerine

           atamak istedigimiz degerleri parametre olarak
           constructor'a yollayalim
           ve atamalari constructor icinde yapalim

     */

    public C06_Araba(String mrk, String mdl, boolean hmi, int yl, int fyt){
        yil = yl;
        marka = mrk;
        model = mdl;
        hasarliMi = hmi;
        fiyat = fyt;
    }

    public C06_Araba(){

    }

    int yil;
    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    boolean hasarliMi;
    int fiyat;

    //Code --->Generate---> toString getirdik
    @Override
    public String toString() {
        return "Araba Ozellikleri{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    public void yakitTuketimi(String yakitTuru){

        switch (yakitTuru){
            case "Benzin" :
                System.out.println("Benzinli araclar icin tuketim : 6/100 lt/km");
                break;
            case "Dizel" :
                System.out.println("Dizel araclar icin tuketim : 5/100 lt/km");
                break;
            case "Elektrik" :
                System.out.println("Elektrikli araclar icin tuketim : 5/100 kW/km");
                break;
            default:
                System.out.println("Gecersiz yakit turu");


        }
    }
}
