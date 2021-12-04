package labs_examples.objects_classes_methods.labs.objects;

public class Mammal {

    String species;
    String color;
    int numOfLegs;
    int numOfArms;

    public Mammal(String species, String color, int numOfLegs, int numOfArms) {
        this.species = species;
        this.color = color;
        this.numOfLegs = numOfLegs;
        this.numOfArms = numOfArms;
    }

    public Mammal(String species, String color, int numOfLegs){
        this.species = species;
        this.color = color;
        this.numOfLegs = numOfLegs;
    }

    public Mammal(String species, String color){
        this.species = species;
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfArms() {
        return numOfArms;
    }

    public void setNumOfArms(int numOfArms) {
        this.numOfArms = numOfArms;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", numOfLegs=" + numOfLegs +
                ", numOfArms=" + numOfArms +
                '}';
    }
}
