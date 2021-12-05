package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class DirtTrack implements Racetrack{

    protected String name;
    protected String location;
    protected int leftTurns;
    protected int rightTurns;
    protected boolean isClockwise;
    protected double lapRecord;

    public DirtTrack(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord) {
        this.name = name;
        this.location = location;
        this.leftTurns = leftTurns;
        this.rightTurns = rightTurns;
        this.isClockwise = isClockwise;
        this.lapRecord = lapRecord;
    }

    public void vehiclesToGrid(){
        System.out.println("sending vehicles to starting grid");
    };
    public void startQualifying(){
        System.out.println("starting qualifying session");
    };
    public void startRace(){
        System.out.println("starting race");
    };

}
