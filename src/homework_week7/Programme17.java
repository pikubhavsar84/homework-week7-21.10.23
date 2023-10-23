package homework_week7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {
    public static void main(String[] args) {
        // Sorting a Numeric Array
        int[] numericArray = {4, 1, 9, 1, 5, 2, 3, 8, 4, 7};
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array (Ascending): " + Arrays.toString(numericArray));

        // Sorting a String Array
        String[] stringArray = {"Apple", "Grapes", "Cherry", "Date", "Fig"};
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array (Ascending): " + Arrays.toString(stringArray));
    }
}
