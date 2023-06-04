package day26_localTime;

import java.time.LocalDate;

public class C02_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); // 2023-03-10

        System.out.println(tarih.isLeapYear()); // false artik yil

        LocalDate tarih2 = LocalDate.of(2020,10,10);
        System.out.println(tarih2.isLeapYear()); // true

        System.out.println(tarih.plusWeeks(2)); // 2023-03-24

        System.out.println(tarih.withYear(1923).withMonth(5)); // 1923-05-10

        System.out.println(tarih.getDayOfYear()); // 69

        System.out.println(tarih.getMonth()); // MARCH

        System.out.println(tarih.getDayOfWeek()); // FRIDAY


    }
}
