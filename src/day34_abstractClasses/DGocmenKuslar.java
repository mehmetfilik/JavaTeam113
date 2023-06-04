package day34_abstractClasses;

public class DGocmenKuslar extends BKuslar{


    /*
        Sadece ayrimi belirtmek icin
        abstract olmayan class'lara CONCRETE Class denir

        1- abstract bir class
        parent'i olan abstract class'daki
        abstract method'lari Imlement etmek zorunda degildir

        isterse Implement edip Concrete hale getirir
        isterse yok sayar

        2- abstract bir silsileden sonra gelen
        ilk Concrete class
        parent veya grandParent(s) olan absract class'larda
        Concrete yapilmayan tum abstract class'lari
        Implement etmek ZORUNDADIR

     */
    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}
