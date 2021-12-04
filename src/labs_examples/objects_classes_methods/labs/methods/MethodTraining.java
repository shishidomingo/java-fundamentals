package labs_examples.objects_classes_methods.labs.methods;
//package labs_examples.objects_classes_methods.examples;
import videos_source_code.oop.inheritance.Truck;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodTraining {

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 14;
        System.out.print("5 x 9 = ");
        System.out.print(multiply(a,b));
        System.out.println();
        System.out.print("5 x 9 x 14 = ");
        System.out.print(multiply(a,b,c));
        System.out.println();

        MethodTraining ex = new MethodTraining();

        Truck vehicle = new Truck("Chevy", "Silverado", 55000, 50);
        testMiles(vehicle);

        System.out.println("The largest of 2, 35, 6, 14 is " + findLargest(2, 35, 6, 14));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word to find the # of consonants:");
        String input = new String();
        input = scanner.next();
        char[] inputArray = input.toCharArray();
        int consonantCount = 0;

        for (int i = 0; i < inputArray.length; i++){
            consonantCount += isConsonant(inputArray[i]);
        }

        System.out.println("There are " + consonantCount + " consonants in " + input);

        System.out.println("Enter a number to find out if it is prime:");
        int inputInt = scanner.nextInt();
        System.out.println("Primeness? " + isPrime(inputInt));


        int[] array = {12, 5, -4, 226, -1010, 849, 12, -49, 68};
        System.out.println("For the array " + Arrays.toString(array));
        System.out.println("Lowest and highest values are: " + Arrays.toString(smallAndLarge(array)));

        System.out.println("The quantity of numbers between 0 and 9636 that are divisible by 3 and 6 are: ");

        System.out.println(divisibleCheck(9636, 3, 6).size());

        System.out.println("input: 1,2,3,4,5");
        int[] reverseArrayInput = {1, 2, 3, 4, 5};
        System.out.println("output: " + Arrays.toString(reverseArray(reverseArrayInput)));
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int multiply(int a, int b, int c){
        return a*b*c;
    }

    public static void testMiles(Truck example){
        System.out.println("The " + example.getModel() + " has " + example.getMiles() + " miles.");
    }

    public static int findLargest (int a, int b, int c, int d){
        int intArray[] = {a, b, c, d};
        int largest = intArray[0];

        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] > largest){
                largest = intArray[i];
            }

        }
        return largest;

    }



    public static int isConsonant(char c){
        char[] vowels = {'a','e','i','o','u'};
        for (char vowel : vowels) {
            if (c == vowel){
                return 0;
            }
        }
        return 1;
    }

    public static boolean isPrime (int input){
        for (int i = 2; i <= input/2; i++){
            if (input % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int[] smallAndLarge (int[] array){

        int smallest = array[0];
        int largest = array[0];

        for (int i: array){
            if (i < smallest){
                smallest = i;
            }
            if (i > largest){
                largest = i;
            }
        }

        int[] output = {smallest, largest};
        return output;
    }

    public static ArrayList<Integer> divisibleCheck (int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> quotients = new ArrayList<Integer>();
        for (int i = 1; i < maxNum; i++){
            if (i % divisor1 == 0 && i % divisor2 == 0){
                quotients.add(i);
            }
        }

        return quotients;


    }

    public static int[] reverseArray (int[] array){

        int temp = 0;
        for (int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length -1 - i];
            array[array.length -1 -i] = temp;

        }
        return array;
    }
}
