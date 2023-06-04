package day11_dersTekrari;

public class C06 {

    public static void main(String[] args) {


        ////Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //        // input1 : “15.30 €” , input2 : “11.40 €”
        //        // output : 36.70 €

        String input1 = "15.30 €";
        String input2 = "11.40 €";

        input1 = input1.replaceAll("\\D","");
        input2 = input2.replaceAll("\\D","");

        System.out.println(input1);
        System.out.println(input2);

        double inp1 = Double.parseDouble(input1);
        double inp2 = Double.parseDouble(input2);

        //input1 = Double.parseDouble(input1);

        double output = inp1+inp2;
        System.out.println("output : " + output/100 + " €");



    }
}
