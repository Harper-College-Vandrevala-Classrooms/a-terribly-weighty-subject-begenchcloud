package com.csc;

import java.util.Scanner;

public class Converter {

   
    public String toPounds(int ounces) {
        double pounds = ounces / 16.0;
        String poundUnit = (pounds == 1.0) ? "lb" : "lbs";
        return String.format("%d ounces is equivalent to %.4f %s", ounces, pounds, poundUnit);
    }

  
    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;
        String poundUnit = (pounds == 1) ? "lb" : "lbs";
        String ounceUnit = "oz";  

        if (pounds == 0) {
            return String.format("%d ounces is equivalent to %d %s", ounces, remainingOunces, ounceUnit);
        } else if (remainingOunces == 0) {
            return String.format("%d ounces is equivalent to %d %s", ounces, pounds, poundUnit);
        } else {
            return String.format("%d ounces is equivalent to %d %s and %d %s", ounces, pounds, poundUnit, remainingOunces, ounceUnit);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();


        System.out.print("Enter the number of ounces: ");
        int ounces = scanner.nextInt();


        System.out.println("Decimal pounds: " + converter.toPounds(ounces));
        System.out.println("Pounds and ounces: " + converter.toPoundsAndOunces(ounces));


        scanner.close();
    }
}
