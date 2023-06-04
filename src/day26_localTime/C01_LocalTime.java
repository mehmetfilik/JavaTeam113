package day26_localTime;

import java.time.LocalTime;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(20,15);
        System.out.println(saat1); //20:15

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 21:39:02.178603800

        //LocalTime objesi olan saat variable'i canli bir saat degildir
        // olusturuldugu andaki local time'i sistemden alip kaydettigimiz
        // kodu ilerleyen kisminda ne kadar sure gectigini gormek icin
        // saati iyeniden almamiz gerekirse , yeni bir localTime bjesi daha olusturmaliyiz

        System.out.println(saat.getHour());
        // get methodlari LocalTime objesinin saat, dakika, saniye ve nano degerlerini bize getirir

        System.out.println(saat.plusMinutes(10));

        System.out.println(saat.minusMinutes(10).minusSeconds(10));

        System.out.println(saat.withSecond(0).withNano(20));

        System.out.println(saat.compareTo(saat1)); // 1

        System.out.println(saat.isAfter(saat1)); // true

        System.out.println(saat.isBefore(saat1)); // false

        System.out.println(saat.toSecondOfDay()); // 78029

    }


}
