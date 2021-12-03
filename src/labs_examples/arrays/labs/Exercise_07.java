package labs_examples.arrays.labs;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How long would you like your ArrayList to be?");
        int length = scanner.nextInt();
        System.out.println("Generating your " + length + " element ArrayList now.");
        System.out.println("Here is your ArrayList: ");

        for (int i = 0; i < length; i++){
            myList.add(i*6);
            System.out.println(myList.get(i));
        };



    }
}
