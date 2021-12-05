package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

/*
    AsphaltOval is a subclass of AsphaltTrack.  It will never be directly called as all tracks that are asphalt ovals
    will be either short tracks or intermediate/superspeedway tracks.  Accordingly, this class will be further extended
    by classes for those categories.
 */

public class AsphaltOval extends AsphaltTrack{

    protected double banking;   // banking is the only additional variable to be tracked for Asphalt Ovals compared to other Asphalt Tracks

    // overloaded constructor to include banking
    public AsphaltOval(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord, double banking){

        super(name, location, leftTurns, rightTurns, isClockwise, lapRecord);    // invoking constructor of superclass AsphaltOval

        this.banking = banking;      // adding setting banking variable
    }


    // overriding startQualifying method as qualifying is solo in Asphalt Oval, vs group qual in other Asphalt racing
    @Override
    public void startQualifying(){
        System.out.println("starting solo qualifying sessions");
    };

    // getter for banking variable
    public double getBanking() {         // method t
        return banking;
    }

    // setter for banking variable
    public void setBanking(double banking) {
        this.banking = banking;
    }

}
