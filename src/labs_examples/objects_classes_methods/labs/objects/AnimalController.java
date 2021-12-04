package labs_examples.objects_classes_methods.labs.objects;

public class AnimalController {

    public static void main(String[] args) {

        Mammal blueWhale = new Mammal("blue whale", "blue", 0, 0);
        Ocean pacific = new Ocean("pacific", "both");

        System.out.println("The " + blueWhale.getSpecies() + " lives in the " + pacific.getName());

        Mammal blackLab = new Mammal("black lab", "black");
        Mammal calicoCat = new Mammal("calico cat", "orange", 4);

        System.out.println(blackLab.toString());
        System.out.println(calicoCat.toString());

    }

}
