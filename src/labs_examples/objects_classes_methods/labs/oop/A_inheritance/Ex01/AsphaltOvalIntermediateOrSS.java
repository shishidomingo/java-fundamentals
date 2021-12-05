package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class AsphaltOvalIntermediateOrSS extends AsphaltOval{

    boolean isTriOval;

    public AsphaltOvalIntermediateOrSS(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord, double banking, boolean isTriOval) {
        super(name, location, leftTurns, rightTurns, isClockwise, lapRecord, banking);
        this.isTriOval = isTriOval;
    }

    public boolean isTriOval() {
        return isTriOval;
    }

    public void setTriOval(boolean triOval) {
        isTriOval = triOval;
    }

    @Override
    public String toString() {
        return "AsphaltOvalIntermediateOrSS{" +
                "banking=" + banking +
                ", isTriOval=" + isTriOval +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", leftTurns=" + leftTurns +
                ", rightTurns=" + rightTurns +
                ", isClockwise=" + isClockwise +
                ", lapRecord=" + lapRecord +
                '}';
    }
}
