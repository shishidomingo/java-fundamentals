package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class AsphaltRoad extends AsphaltTrack{

    private double highestElevation;
    private double lowestElevation;

    public AsphaltRoad(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord, double highestElevation, double lowestElevation){
        super(name, location, leftTurns, rightTurns, isClockwise, lapRecord);
        this.lowestElevation = lowestElevation;
        this.highestElevation = highestElevation;
    }

}
