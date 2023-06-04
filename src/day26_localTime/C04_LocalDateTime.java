package day26_localTime;


import java.time.LocalDateTime;

public class C04_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); // 2023-03-10T22:05:43.963104100

        System.out.println(ldt.toLocalDate()); // 2023-03-10


    }
}
