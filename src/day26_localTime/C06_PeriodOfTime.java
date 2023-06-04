package day26_localTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C06_PeriodOfTime {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1980,1,1);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi,bugun)); // P43Y2M9D

        System.out.println("Yas : " + Period.between(dogumTarihi,bugun).getYears()); // Yas : 43
        System.out.println("Yas : " + Period.between(dogumTarihi,bugun).getDays()); // Yas : 9




    }
}
