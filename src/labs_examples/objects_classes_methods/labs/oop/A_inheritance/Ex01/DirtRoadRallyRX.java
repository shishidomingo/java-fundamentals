package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class DirtRoadRallyRX extends DirtRoadRally{

    int jokerLaps;
    int jumps;

    public DirtRoadRallyRX(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord, double highestElevation, double lowestElevation, String surface, String isManMadeCourse, int jokerLaps, int jumps) {
        super(name, location, leftTurns, rightTurns, isClockwise, lapRecord, highestElevation, lowestElevation, surface, isManMadeCourse);
        this.jokerLaps = jokerLaps;
        this.jumps = jumps;
    }

    @Override
    public void startQualifying(){
        System.out.println("starting solo qualifying session");
    };

    public int getJokerLaps() {
        return jokerLaps;
    }

    public void setJokerLaps(int jokerLaps) {
        this.jokerLaps = jokerLaps;
    }

    public int getJumps() {
        return jumps;
    }

    public void setJumps(int jumps) {
        this.jumps = jumps;
    }

    @Override
    public String toString() {
        return "DirtRoadRallyRX{" +
                "highestElevation=" + highestElevation +
                ", lowestElevation=" + lowestElevation +
                ", surface='" + surface + '\'' +
                ", isManMadeCourse='" + isManMadeCourse + '\'' +
                ", jokerLaps=" + jokerLaps +
                ", jumps=" + jumps +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", leftTurns=" + leftTurns +
                ", rightTurns=" + rightTurns +
                ", isClockwise=" + isClockwise +
                ", lapRecord=" + lapRecord +
                '}';
    }
}
