package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class AsphaltOval extends AsphaltTrack{

    protected double banking;

    public AsphaltOval(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord, double banking){

        super(name, location, leftTurns, rightTurns, isClockwise, lapRecord);

        this.banking = banking;
    }

    @Override
    public void startQualifying(){
        System.out.println("starting solo qualifying sessions");
    };

    public double getBanking() {
        return banking;
    }

    public void setBanking(double banking) {
        this.banking = banking;
    }

}
