package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class AsphaltTrack implements Racetrack{

    protected String name;
    protected String location;
    protected int leftTurns;
    protected int rightTurns;
    protected boolean isClockwise;
    protected double lapRecord;

    public AsphaltTrack(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord) {
        this.name = name;
        this.location = location;
        this.leftTurns = leftTurns;
        this.rightTurns = rightTurns;
        this.isClockwise = isClockwise;
        this.lapRecord = lapRecord;
    }

    @Override
    public void vehiclesToGrid(){
        System.out.println("sending vehicles to starting grid");
    };

    @Override
    public void startQualifying(){
        System.out.println("starting qualifying session");
    };

    @Override
    public void startRace(){
        System.out.println("starting race");
    };

}
