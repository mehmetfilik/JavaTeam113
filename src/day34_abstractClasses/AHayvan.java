package day34_abstractClasses;

public abstract class AHayvan {

    /*
        Bir class'i abstract class yapmak icin deklerasyona
        anstract keyword'unu yazmak yeterlidir

        Abstract class'lar class olduklari icinconstructor'lari vardir
        ama abstrsact class'lardan obje olusturulamaz

        Abstract class'larda bugune kadar kullandigimiz yapida
        method'lar olusturabiliriz ancak bunlar child class'lar tarafindan
        uyarlanmak (overrride) zorunda olmaz

        Child class'lari uyarlamaya mecbur etmek istedigimiz method'lari da
        abstract yapmaliyiz

        bir methodu abstract yapmak icin
        declaration'a abstract yazmamiz yeterlidir

     */

    public abstract void hareket();
    public abstract void solunum();
    public abstract void beslenme();
    public abstract void cogalma();
    public abstract void omur();
}
