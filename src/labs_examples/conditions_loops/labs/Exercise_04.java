package labs_examples.conditions_loops.labs;

import java.sql.SQLOutput;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if (i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}
