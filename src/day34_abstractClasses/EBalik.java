package day34_abstractClasses;

public abstract class EBalik extends AHayvan {

    public void hareket(){
        System.out.println("baliklar yuzer");
    }

    public void solunum(){
        System.out.println("baliklar solungac solunumu yapar");
    }

    public void cogalma(){
        System.out.println("baliklar yumurta ile cogalir");
    }

    public abstract void yuzgec();
    public abstract void yasamAlani();
    public abstract void iskeletYapisi();

}
