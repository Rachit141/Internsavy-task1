import java.util.Scanner;
public class temperature_conversion_tool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the temperature in Fahrenheit from the user.
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert the temperature from Fahrenheit to Celsius.
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print the temperature in Celsius.
        System.out.println("The temperature in Celsius is: " + celsius);

        // Get the temperature in Celsius from the user.
        System.out.print("Enter the temperature in Celsius: ");
        celsius = sc.nextDouble();

        // Convert the temperature from Celsius to Fahrenheit.
        fahrenheit = (celsius * 9 / 5) + 32;

        // Print the temperature in Fahrenheit.
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}
