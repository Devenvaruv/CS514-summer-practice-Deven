package main;

public class ConversionsHelper {

    public static double ouncesToGallons(int ounces) {
        return Math.round(ounces/128d * 10000d) / 10000d;
    }


    public static double cmToFeet(int cm) {
        return cm /30.48d;
    }

    public static void main(String[] args) {
        int ounces = 10;
        int cm = 100;
        System.out.println(ounces + " ounces = " + ConversionsHelper.ouncesToGallons(ounces) + " gallons.");
        System.out.println(cm + " cm = " + ConversionsHelper.cmToFeet(cm) + " feet.");
    }
}
