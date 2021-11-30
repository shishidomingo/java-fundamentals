package labs_examples.conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String input = scanner.next();

        int firstVowelIndex = firstVowelIndex(input);

        System.out.println("The word is " + input);
        if (firstVowelIndex > -1) {
            char firstVowel = input.charAt(firstVowelIndex);
            System.out.println("The first vowel is " + firstVowel);
        }
        else {
            System.out.println("There are no vowels.");
        }




    }

    public static int firstVowelIndex(String input){
        String vowels = "aeiou";

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (input.charAt(i) == vowels.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
