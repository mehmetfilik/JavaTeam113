package day08_nestedIfElse_ternary;

public class C10_NestedTernary {

    public static void main(String[] args) {

        int sayi = -20;

        System.out.println(sayi>0
                ? sayi%2==0 ? "cift sayi" : "tek sayi"
                : sayi>-1000 && sayi<-99 ? "3 basamakli" : "3 basamakli degil");
    }
}
