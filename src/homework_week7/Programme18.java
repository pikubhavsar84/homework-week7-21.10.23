package homework_week7;

/**
 *  Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {5, 12, 8, 3, 7};

        // Initialize a variable to store the sum
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int number : numbers) {
            sum += number;
        }

        // Print the sum of the array
        System.out.println("Sum of the array: " + sum);
    }
}
