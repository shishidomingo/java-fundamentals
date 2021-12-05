package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 *  10 prints out.  the line A a = new B(); instantiates a new object called a, which is a member of class A.
 *  since a member of class A has a integer i with a value of 10, a.i returns that value.  that it is instantiated
 *  as a new B() is not relevant because that only gives object a access to the methods in class B.
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}