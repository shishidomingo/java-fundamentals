package labs_examples.static_nonstatic.labs;

public class ex01 {


    public static void main(String[] args) {
        mainStaticA();
        //mainStaticB();
        mainStaticC();
        ex01NewClass obj4 = new ex01NewClass();
        obj4.newNonStaticD();
    }

    public static void mainStaticA(){
        System.out.println("mainStaticA calling mainStaticB:");
        mainStaticB();
    }

    public static void mainStaticB(){
        System.out.println("this is mainStaticB");
        System.out.println("mainStaticB calling newStaticA");
        ex01NewClass.newStaticA();
    }

    public static void mainStaticC(){
        System.out.println("mainStaticC calling mainNonStaticC");
        ex01 obj = new ex01();
        obj.MainNonStaticC();

        System.out.println("MainStaticC calling newNonStaticC");
        ex01NewClass obj2 = new ex01NewClass();
        obj2.newNonStaticC();
    }

    public void MainNonStaticC(){
        System.out.println("this is coming from mainNonStaticC");
    }

    public void mainNonStaticD(){
        System.out.println("this is coming from mainNonStaticD");
    }
}

class ex01NewClass{
    public static void newStaticA(){
        System.out.println("this is coming from newStaticA");
    }

    public static void newStaticB(){
        System.out.println("this is coming from newStaticB");
    }

    public void newNonStaticC(){
        System.out.println("this is coming from newNonStaticC");
    }

    public void newNonStaticD(){
        System.out.println("newNonStaticD calling newNonStaticC");
        newNonStaticC();

        System.out.println("newNonStaticD calling mainNonStaticD");
        ex01 obj3 = new ex01();
        obj3.mainNonStaticD();

        System.out.println("newNonStaticD calling newStaticA");
        newStaticA();


        System.out.println("newNonStaticD calling mainStaticB");
        ex01.mainStaticA();
    }
}