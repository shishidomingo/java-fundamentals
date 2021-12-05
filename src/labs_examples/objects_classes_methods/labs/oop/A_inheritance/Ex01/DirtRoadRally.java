package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class DirtRoadRally extends DirtRoad{

    boolean isManMadeCourse;

    public DirtRoadRally(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord, double highestElevation, double lowestElevation, String surface, boolean
            isManMadeCourse) {
        super(name, location, leftTurns, rightTurns, isClockwise, lapRecord, highestElevation, lowestElevation, surface);
        this.isManMadeCourse = isManMadeCourse;
    }

}
