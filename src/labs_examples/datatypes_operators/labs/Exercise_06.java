package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    static double volumeOfCylinder(double r, int h){
        double volume = Math.PI * r * r * h;
        return volume;
    }

    static double surfaceAreaOfCylinder(double r, int h){
        double surfaceArea = 2 * Math.PI * r * h + 2 * Math.PI * r * r;
        return surfaceArea;
    }

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        int height = 5;

        System.out.println("The volume is " + volumeOfCylinder(radius, height));
        System.out.println("The surface area is " + surfaceAreaOfCylinder(radius, height));

    }
}