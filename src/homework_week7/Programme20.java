package homework_week7;

/**
 *  Write a Java program to test if an array contains a specific value
 */
public class Programme20 {
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {5, 13, 8, 4, 7};

        // Value to search for
        int targetValue = 8;

        // Flag to indicate if the value is found
        boolean found = false;

        // Iterate through the array to check if it contains the target value
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break; // Exit the loop as soon as the value is found
            }
        }

        // Print the result
        if (found) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
