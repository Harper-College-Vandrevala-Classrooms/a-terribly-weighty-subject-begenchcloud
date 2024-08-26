package com.csc;

import java.util.Scanner;

public class Converter {

    public String toPounds(int ounces) {
        double pounds = ounces / 16.0;
        String poundUnit = (pounds == 1.0) ? "lb" : "lbs";
        return String.format("%.4f %s", pounds, poundUnit);
    }

    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;
        String poundUnit = (pounds == 1) ? "lb" : "lbs";
        return String.format("%d %s %d oz", pounds, poundUnit, remainingOunces);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        int ounces = scanner.nextInt();

        System.out.println(converter.toPounds(ounces));
        System.out.println(converter.toPoundsAndOunces(ounces));

        scanner.close();
    }
}
