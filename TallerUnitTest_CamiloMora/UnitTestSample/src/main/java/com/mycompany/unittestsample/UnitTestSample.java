/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.unittestsample;

import java.util.Scanner;

/**
 *
 * @author Natucha
 */
public class UnitTestSample {

    public static void main(String[] args) {
        System.out.println("Select one of the options below");
        System.out.println("1. Add next number");
        System.out.println("8. Convert from Celsius to Fahrenheit.");
        System.out.println("10. Based two numbers return devisible");
        System.out.println("16. Sum the digits of a 4-digit number");
        System.out.println("20. Exit");
        
        Scanner in = new Scanner(System.in);
        String userResult = in.next();
        switch (userResult) {
            case "1":
                System.out.println("Type an integer number:");
                String userNumber = in.next();
                int userNumberInt = Integer.parseInt(userNumber);
                int nextResult = Operations.NextNumber(userNumberInt);
                System.out.println("The next number is: "+nextResult);
                break;
            case "10":
                System.out.println("Type an integer number:");
                String firstDivisibleNumber = in.next();
                System.out.println("Type a second integer number:");
                String secondDivisibleNumber = in.next();
                boolean result = Operations.IsDivisible(Integer.parseInt(firstDivisibleNumber), Integer.parseInt(secondDivisibleNumber));
                if (result) {
                    System.out.println(secondDivisibleNumber + " is divisible into " + firstDivisibleNumber);
                } else {
                    System.out.println(secondDivisibleNumber + " is not divisible into " + firstDivisibleNumber);
                }
                break;
            case "8":
                System.out.print("Enter the temperature in Celsius: ");
                double temperatureCelsius = Double.parseDouble(in.next());
                double temperatureFahrenheit = Operations.TemperatureConverter(temperatureCelsius);
                System.out.println ("The temperature in Fahrenheit is: " + temperatureFahrenheit);
                break;
            case "16":
                System.out.print("Enter a number with up to 4 digits: ");
                int number = Integer.parseInt(in.next());
                int resultDigitSum = Operations.DigitSum(number);
                if (resultDigitSum == -1) {
                    System.out.println("The entered number is not valid. Please enter a number with up to 4 digits.");
                } else {
                    System.out.println("The sum of the digits is: " + resultDigitSum);
                }
                break;
            case "20":
                System.out.print("This program will be closed");
                break;
            default:
                throw new AssertionError();
        }
    }

}
