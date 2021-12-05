package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class DependencyInjectionController {

    public static void main(String[] args) {

        Baseball dodgersvspadres = new Baseball(9, 9, "dodgers", 19, 2, "padres", "dodgers", 26, 2, 0, 8 );
        Diving usavschile = new Diving(21.3, 3, 1, 65, 185,162, "usa", "chile", 8.5);
        DownhillSkiing vonnvsrodriguez = new DownhillSkiing(112.67, 119.25, 1250, 91, 88, "vonn", "rodriguez", 32, 0);

        Dependency newSport = new Dependency(dodgersvspadres);
        newSport.testMethods();

        newSport.setSport(usavschile);
        newSport.testMethods();

        newSport.setSport(vonnvsrodriguez);
        newSport.testMethods();

    }
}
