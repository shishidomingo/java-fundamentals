package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {


        int[][] irregular2D = {
                {123, 456, 789},
                {12, 34, 56, 78, 90},
                {1234, 5678},
        };

        for (int[] i : irregular2D) {

            for (int j : i) {
                System.out.print(j + " ");
            }

            System.out.println();
        }


    }

}
