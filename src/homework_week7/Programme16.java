package homework_week7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        scanner.close();//scanner is closing

        if (number > 0) {
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
    }
}
