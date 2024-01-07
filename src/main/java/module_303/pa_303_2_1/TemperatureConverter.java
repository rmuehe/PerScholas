package pa_303_2_1;

import java.util.Scanner;
public class TemperatureConverter {

    private static final double FAHRENHEIT_TO_CELSIUS = 5.0 / 9.0;
    private static final double CELSIUS_TO_FAHRENHEIT = 9.0 / 5.0;
    private static final double FAHRENHEIT_DIFF = 32.0;

    // Converts Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * CELSIUS_TO_FAHRENHEIT) + FAHRENHEIT_DIFF;
    }

    // Converts Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_DIFF) * FAHRENHEIT_TO_CELSIUS;
    }

    // Generates a table from -10C to 30C in Fahrenheit
    private static void generateTemperatureTable() {
        System.out.println("Celsius     Fahrenheit");
        for (int i = -10; i <= 30; i++) {
            System.out.printf("%d     %.2f\n", i, celsiusToFahrenheit(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = sc.next().toUpperCase().charAt(0);

        if (unit == 'C') {
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        } else if (unit == 'F') {
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        } else {
            System.out.println("Invalid unit");
        }

        // Generate temperature table
        generateTemperatureTable();

        sc.close();
    }
}