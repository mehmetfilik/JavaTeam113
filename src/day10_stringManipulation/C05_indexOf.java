package day10_stringManipulation;

public class C05_indexOf {

    public static void main(String[] args) {

        String str = "Java cok ama cok guzel";
        System.out.println(str.indexOf("c")); //5

        System.out.println(str.indexOf("a")); //1 birden fazla ise ilk buldugunu verir.

        System.out.println(str.indexOf("cok")); //5

        System.out.println(str.indexOf("cok",6)); //aramaya 6.index'den itibaren baslar. 13 bulur

        System.out.println(str.indexOf("cok",5)); //5

        System.out.println(str.indexOf("ajda")); //-1
                                                //cumlede olmayan bir harf icin -1 sonucu gelir


        //verilen bir cumlede istenen bir String icin
        //asagidaki cumlelerden uygun olani yazdirin
        //1- aradiginiz kelime cumlede 1 kere kullanilmis
        //2- aradiginiz kelime cumlede 2 kere kullanilmis
        //3- aradiginiz kelime cumlede 2'den fazla kullanilmis
        //4- aradiginiz kelime cumlede hic kullanilmamis

        String cumle = "Yasasin java, iyi ki java ogreniyorum";
        String kelime = "java";

        if (cumle.indexOf(kelime)==-1){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else { // kesinlikle cumlede var, ama kac tane?
            int kelimeIlkIndex = cumle.indexOf(kelime); // 8
            if (cumle.indexOf(kelime,(kelimeIlkIndex+1))==(-1)) {
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            } else {
                int kelimeIkiIndex = cumle.indexOf(kelime, (kelimeIlkIndex+1)); // 8
                if (cumle.indexOf(kelime,(kelimeIkiIndex+1))==(-1)) {
                    System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                } else {
                    System.out.println("aradiginiz kelime cumlede 2'den fazla kullanilmis");
                }
            }

        }

    }
}
