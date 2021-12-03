package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10: ");

        int input = scanner.nextInt();

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int counter = 0;

        for (int i : array) {

            if (input == i){
                System.out.println("That is index " + counter);

            }
            counter++;
        }
        // write code here


    }
}