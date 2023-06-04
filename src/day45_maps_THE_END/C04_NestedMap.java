package day45_maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C04_NestedMap {
    public static void main(String[] args) {

        /*
        Asagidaki body’yi map olarak olusturun
        {
            “firstname” : “Ahmet”,
            “lastname” : “Bulut”,
            “totalprice” : 500,
            “depositpaid” : false,
            “bookingdates” : {
                   “checkin” : “2021-06-01”,
                   “checkout” : “2021-06-10”
                      },
            “additionalneeds” : “wi-fi” }
         */

        Map<String,Object> reqBody = new HashMap<>();
        reqBody.put("firstname","Burcu");
        reqBody.put("lastname","Sever");
        reqBody.put("totalprice",500);
        reqBody.put("depositpaid",false);

        Map<String,String> bookingdatesMap = new HashMap<>();
        bookingdatesMap.put("checkin","2021-06-01");
        bookingdatesMap.put("checkout","2021-06-10");

        reqBody.put("bookingdates",bookingdatesMap);
        reqBody.put("additionalneeds","wi-fi");

        System.out.println(reqBody);

        /*
        {firstname=Burcu,
         additionalneeds=wi-fi,
         bookingdates={
                checkin=2021-06-01,
                checkout=2021-06-10
                },
         totalprice=500,
         depositpaid=false,
         lastname=Sever}

         */

        System.out.println(reqBody.get("firstname")); // Burcu
        System.out.println(reqBody.get("lastname")); // Sever
        System.out.println(reqBody.get("totalprice")); // 500
        System.out.println(reqBody.get("totalpricde")); // null yanlis key cagirirsak null döner

        // checkin ve checkout nasil yazdiririz
        // inner map'in icinde olduklari icin once inner map'i sonra onun icinden bilgileri alacagiz

        System.out.println(reqBody.get("bookingdates")); // {checkin=2021-06-01, checkout=2021-06-10}

        System.out.println(((Map) reqBody.get("bookingdates")).get("checkin")); // 2021-06-01
        System.out.println(((Map) reqBody.get("bookingdates")).get("checkout")); // 2021-06-10

        // ismi Selcuk yapalim

        reqBody.put("firstname", "Selcuk");
        System.out.println(reqBody);

        // checkout'u 2021-06-17 yapalim

        bookingdatesMap.put("checkout","2021-06-17");
        reqBody.put("bookingdates",bookingdatesMap);
        System.out.println(reqBody);

    }
}
