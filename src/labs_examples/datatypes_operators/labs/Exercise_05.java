package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        boolean c = true;
        boolean d = false;
        if (a & c){
            System.out.println("a and c are true");
        }

        if (a && c){
            System.out.println("a and c are true, verified via short circuit");
        }

        if (b || c){
            System.out.println("b or c are true, verified via short circuit");
        }

        if (a ^ d){
            System.out.println("either a or d are true, but not both");
        }

        if (!d){
            System.out.println("d is not true");
        }

    }

}

