package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class DirtRoadRallyStage extends DirtRoadRally{

    double distance;

    public DirtRoadRallyStage(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord, double highestElevation, double lowestElevation, String surface, String isManMadeCourse, double distance) {
        super(name, location, leftTurns, rightTurns, isClockwise, lapRecord, highestElevation, lowestElevation, surface, isManMadeCourse);
        this.distance = distance;
    }

    @Override
    public void vehiclesToGrid(){ System.out.println("there is no starting grid for this type of race");}

    @Override
    public void startQualifying(){ System.out.println("there is no qualifying session for this type of race");};

    @Override
    public void startRace(){ System.out.println("sending first car onto stage");};

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "DirtRoadRallyStage{" +
                "highestElevation=" + highestElevation +
                ", lowestElevation=" + lowestElevation +
                ", surface='" + surface + '\'' +
                ", isManMadeCourse='" + isManMadeCourse + '\'' +
                ", distance=" + distance +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", leftTurns=" + leftTurns +
                ", rightTurns=" + rightTurns +
                ", isClockwise=" + isClockwise +
                ", lapRecord=" + lapRecord +
                '}';
    }
}
