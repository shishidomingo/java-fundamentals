package labs_examples.objects_classes_methods.labs.methods;
import java.util.Scanner;
/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("5 x 3 = " + multiply(5,3));
        System.out.println("15 / 3 = " + divide(15,3));
        pickJoke();
        System.out.println("22 years is " + yearsToSeconds(22) + " seconds");
        System.out.println("There are " + countArgs("I", "am", "the", "great", "cornholio") + " words in " + "I am the great cornholio");
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a*b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a/b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void pickJoke(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a joke 1-3:");
        int input = scanner.nextInt();
        String j1 = "What did the five fingers say to the face? SLAP";
        String j2 = "Why did the chicken cross the road? Because you stink";
        String j3 = "Two guys walk into a bar.  First one says ow.";
        switch(input){
            case 1:
                System.out.println(j1);
                break;
            case 2:
                System.out.println(j2);
                break;
            case 3:
                System.out.println(j3);
                break;
        };

    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    public static long yearsToSeconds (int years){
         return years * 365 * 24 * 60 * 60;
    }
    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int countArgs (String... s){
        int count = 0;
        for (String c : s) {
            count++;
        }
        return count;
    }






}
