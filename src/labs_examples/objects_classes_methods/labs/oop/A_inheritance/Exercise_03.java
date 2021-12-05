package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer:
 *  in the psvm method, a new C_1 object called c is instantiated.  this calls the constructor class of C_1; which inherits
 *  the constructor of B_1, which then inherits the constructor of A_1.  the order of execution of constructors starts from
 *  the highest parent class and moves down to the lowest child class.  accordingly, A_1 executes first, then B_1, then C_1.
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
}
