package com.csc;

import java.util.Scanner;

public class Converter {

    // Method to convert ounces to decimal pounds
    public String toPounds(int ounces) {
        double pounds = ounces / 16.0;
        String poundUnit = (pounds == 1.0) ? "lb" : "lbs";
        return String.format("%d ounces is equivalent to %.4f %s", ounces, pounds, poundUnit);
    }

    // Method to convert ounces to pounds and remaining ounces
    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;
        String poundUnit = (pounds == 1) ? "lb" : "lbs";
        String ounceUnit = "oz";  // "oz" is the same in singular and plural

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

        // Prompt user for input
        System.out.print("Enter the number of ounces: ");
        int ounces = scanner.nextInt();

        // Display the conversion results
        System.out.println("Decimal pounds: " + converter.toPounds(ounces));
        System.out.println("Pounds and ounces: " + converter.toPoundsAndOunces(ounces));

        // Close the scanner
        scanner.close();
    }
}
