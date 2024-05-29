package practice;

import java.util.Scanner;

/**
 * 
 */
public class TemperatureConversionApp {
    public void getFahrenheitToCentigrade(double fahrenheit) {
        double centigrade = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.println(fahrenheit + "°F is " + centigrade + "°C");
    }

    public void getCentigradeToFahrenheit(double centigrade) {
        double fahrenheit = (centigrade * 9 / 5) + 32;
        System.out.println(centigrade + "°C is " + fahrenheit + "°F");
    }

    public static void main(String[] args) {
        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // create an instance of the TemperatureConversionApp
        TemperatureConversionApp app = new TemperatureConversionApp();

        System.out.println("Select options: \n" +
                "1. Convert Fahrenheit to Centigrade.\n" +
                "2. Convert Centigrade to Fahrenheit.\n");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                app.getFahrenheitToCentigrade(fahrenheit);
                break;

            case 2:
                System.out.print("Enter temperature in Centigrade: ");
                double centigrade = scanner.nextDouble();
                app.getCentigradeToFahrenheit(centigrade);
                break;

            default:
                System.out.println("Nothing");
        }

        // close the scanner
        scanner.close();
    }
}

// A Fahrenheit to centigrade conversion application
