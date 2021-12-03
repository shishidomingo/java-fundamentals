package labs_examples.objects_classes_methods.labs.methods;

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
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int multiply(int a, int b, int c){
        return a*b*c;
    }
}
