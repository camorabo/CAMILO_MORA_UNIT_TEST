/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unittestsample;

/**
 *
 * @author kmilo
 */
public class Operations {

    public static int NextNumber(int userNumber) {
        return userNumber + 1;
    }

    public static boolean IsDivisible(int firstNumber, int secondNumber) {
        int moduleResult = secondNumber % firstNumber;
        return moduleResult == 0;
    }

    public static double TemperatureConverter(double temperatureCelsius) {

        double temperatureFahrenheit = (9.0 / 5.0) * temperatureCelsius + 32;
        return temperatureFahrenheit;
    }
    
    public static int DigitSum(int number) {
        // Validate that the number is in the range of 0 to 9999
        if (number < 0 || number > 9999) {
            System.out.println("Please enter a number with up to 4 digits.");
            return -1;
        }

        // Calculate the sum of the digits
        int digitSum = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            digitSum += tempNumber % 10;  // Get the last digit and add it to the sum
            tempNumber /= 10;  // Remove the last digit
        }
        
        return digitSum;
    }
}
