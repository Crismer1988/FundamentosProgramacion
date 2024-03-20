import java.util.Scanner;
/* This class will allow us to use scanner to enter primitive data types, 
or the three numbers required for this example specifically. */

public class ComparadorNumeros {

    public static void main(String[] args) {

        /* We call the class and create an object scanner, 
        then with new, we create a place for the Scanner constructor in the memory.
        System.in allows to enter the data. */

        Scanner scanner = new Scanner(System.in);

        /* User prompt to enter the data */

        System.out.print("Enter the two real numbers to compare followed by the desired tolerance:");

        /* The method .nextDouble will make sure that only real numbers are being entered.
        If not, the program should prompt an error and fail. */

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double tolerance = scanner.nextDouble();

        /* With the if statement, we proceed to identify if the conditions for tolerance are met. 
        The Math.abs method returns the absolute value of our input for accuracy purposes. */

        if (Math.abs(num1 - num2) <= tolerance) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        scanner.close();
    }
}