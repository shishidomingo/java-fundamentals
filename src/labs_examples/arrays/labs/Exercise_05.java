package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        int[] myArray = {12, 24, 36, 48, 60, 72, 84};

        for (int i = myArray.length; i > 0; i = i-2){
            System.out.println(myArray[i-1]);

        }
    }

}
