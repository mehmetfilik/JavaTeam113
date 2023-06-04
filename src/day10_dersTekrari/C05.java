package day10_dersTekrari;

public class C05 {

    public static void main(String[] args) {

        //verilen bir cumlede istenen bir String icin
        //asagidaki cumlelerden uygun olani yazdirin
        //1- aradiginiz kelime cumlede 1 kere kullanilmis
        //2- aradiginiz kelime cumlede 2 kere kullanilmis
        //3- aradiginiz kelime cumlede 2'den fazla kullanilmis
        //4- aradiginiz kelime cumlede hic kullanilmamis

        String cumle = "Iyi gunler, teslim tarihinde saat 16:00'dan sonra evde olacagim. Mutlaka zile basin ve bana elden teslim edin. Bana ulasamazsaniz komsularimin zillerine basabilirsiniz ve onlara da teslim edebilirsiniz.";

        String kelime = "gunler";

        if (cumle.indexOf(kelime)==(-1)) {
            System.out.println("Aradiginiz kelime cumlede yok");

            } else {
            int ilkKelime = cumle.indexOf(kelime);
                if (cumle.indexOf(kelime,(ilkKelime+1))==-1) {
                        System.out.println("Cumlede bir kez gecmektedir");
                } else {
                int ikiKelime = cumle.indexOf(kelime,(ilkKelime+1));
                    if (cumle.indexOf(kelime,(ikiKelime+1))==-1){
                        System.out.println("Cumlede iki kez gecmektedir");
                    }    else {
                        System.out.println("Ikiden fazla gecmektedir");
                    }
            }
        }

    }
}
