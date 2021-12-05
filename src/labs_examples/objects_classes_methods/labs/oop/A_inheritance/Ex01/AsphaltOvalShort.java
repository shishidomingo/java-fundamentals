package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class AsphaltOvalShort extends AsphaltOval{

    private int numOfPitLanes;

    public AsphaltOvalShort(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord, double banking, int numOfPitLanes) {
        super(name, location, leftTurns, rightTurns, isClockwise, lapRecord, banking);
        this.numOfPitLanes = numOfPitLanes;
    }

    public int getNumOfPitLanes() {
        return numOfPitLanes;
    }

    public void setNumOfPitLanes(int numOfPitLanes) {
        this.numOfPitLanes = numOfPitLanes;
    }

    @Override
    public String toString() {
        return "AsphaltOvalShort{" +
                "banking=" + banking +
                ", numOfPitLanes=" + numOfPitLanes +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", leftTurns=" + leftTurns +
                ", rightTurns=" + rightTurns +
                ", isClockwise=" + isClockwise +
                ", lapRecord=" + lapRecord +
                '}';
    }
}
