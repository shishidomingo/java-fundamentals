package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class DirtOval extends DirtTrack{

    private double banking;
    private String surface;

    public DirtOval(String name, String location, int leftTurns, int rightTurns, boolean isClockwise, double lapRecord, double banking, String surface){

        super(name, location, leftTurns, rightTurns, isClockwise, lapRecord);

        this.banking = banking;
        this.surface = surface;
    }

    @Override
    public void startQualifying(){
        System.out.println("starting solo qualifying session");
    };

    public double getBanking() {
        return banking;
    }

    public void setBanking(double banking) {
        this.banking = banking;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "DirtOval{" +
                "banking=" + banking +
                ", surface='" + surface + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", leftTurns=" + leftTurns +
                ", rightTurns=" + rightTurns +
                ", isClockwise=" + isClockwise +
                ", lapRecord=" + lapRecord +
                '}';
    }
}
