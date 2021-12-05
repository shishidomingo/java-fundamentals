package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class DirtRoad extends DirtTrack{

    protected double highestElevation;
    protected double lowestElevation;
    protected String surface;

    public DirtRoad(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord, double highestElevation, double lowestElevation, String surface){
        super(name, location, leftTurns, rightTurns, isClockwise, lapRecord);
        this.lowestElevation = lowestElevation;
        this.highestElevation = highestElevation;
        this.surface = surface;
    }

    @Override
    public void startQualifying(){
        System.out.println("starting solo qualifying session");
    };

}
