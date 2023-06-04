package day09_dersTekrari;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 2 basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();

        int onlarBasamagi = sayi / 10;
        int birlerBasamagi = sayi % 10;

        String yaziIle = "";

        switch (onlarBasamagi) {
            case 1:
                switch (birlerBasamagi) {
                    case 0:
                        yaziIle = "On";
                        break;
                    case 1:
                        yaziIle = "Onbir";
                        break;
                    case 2:
                        yaziIle = "Oniki";
                        break;
                    case 3:
                        yaziIle = "Onüç";
                        break;
                    case 4:
                        yaziIle = "Ondört";
                        break;
                    case 5:
                        yaziIle = "Onbeş";
                        break;
                    case 6:
                        yaziIle = "Onaltı";
                        break;
                    case 7:
                        yaziIle = "Onyedi";
                        break;
                    case 8:
                        yaziIle = "Onsekiz";
                        break;
                    case 9:
                        yaziIle = "Ondokuz";
                        break;
                }
                break;
            case 2:
                yaziIle = "Yirmi";
                break;
            case 3:
                yaziIle = "Otuz";
                break;
            case 4:
                yaziIle = "Kırk";
                break;
            case 5:
                yaziIle = "Elli";
                break;
            case 6:
                yaziIle = "Altmış";
                break;
            case 7:
                yaziIle = "Yetmiş";
                break;
            case 8:
                yaziIle = "Seksen";
                break;
            case 9:
                yaziIle = "Doksan";
                break;
        }

        if (onlarBasamagi > 1 && birlerBasamagi != 0) {
            yaziIle +="";
        //} else if (onlarBasamagi == 0 && birlerBasamagi == 0) {
        //    yaziIle = "Sıfır";
        //} else if (birlerBasamagi != 0) {
            switch (birlerBasamagi) {
                case 1:
                    yaziIle += " Bir";
                    break;
                case 2:
                    yaziIle += " İki";
                    break;
                case 3:
                    yaziIle += " Üç";
                    break;
                case 4:
                    yaziIle += " Dört";
                    break;
                case 5:
                    yaziIle += " Beş";
                    break;
                case 6:
                    yaziIle += " Altı";
                    break;
                case 7:
                    yaziIle += " Yedi";
                    break;
                case 8:
                    yaziIle += " Sekiz";
                    break;
                case 9:
                    yaziIle += " Dokuz";
                    break;
                default:
                    System.out.println("Tekrar deneyin");

            }



        }
        System.out.println(yaziIle);
    }
}
