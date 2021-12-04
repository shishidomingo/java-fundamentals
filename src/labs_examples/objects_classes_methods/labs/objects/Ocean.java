package labs_examples.objects_classes_methods.labs.objects;

public class Ocean {
    String name;
    String hemisphere;

    public Ocean(String name, String hemisphere) {
        this.name = name;
        this.hemisphere = hemisphere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHemisphere() {
        return hemisphere;
    }

    public void setHemisphere(String hemisphere) {
        this.hemisphere = hemisphere;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "name='" + name + '\'' +
                ", hemisphere='" + hemisphere + '\'' +
                '}';
    }
}
