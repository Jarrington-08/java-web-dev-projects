package org.launchcode;

import java.util.Scanner;
public class NumericTypes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles driven:");
        double miles = input.nextDouble();

        System.out.println("Enter number of gallons of gas used:");
        double gallons = input.nextDouble();

        double milesPerGallon = miles / gallons;
        System.out.println("Your vehicle gets " + milesPerGallon + " miles per gallon");
    }
}
