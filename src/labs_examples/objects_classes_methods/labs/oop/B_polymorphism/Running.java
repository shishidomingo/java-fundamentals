package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Running extends TimedSport{

    private int lanes;
    private boolean hasHurdles;

    public Running(double secsElapsed, double finalTime, int distance, int homeMeetScore, int guestMeetScore, String homeTeam, String guestTeam, int lanes, boolean hasHurdles) {
        super(secsElapsed, finalTime, distance, homeMeetScore, guestMeetScore, homeTeam, guestTeam);
        this.lanes = lanes;
        this.hasHurdles = hasHurdles;
    }

    @Override
    public void startEvent(){
        System.out.println("starter's pistol has fired");
    }

    public int getLanes() {
        return lanes;
    }

    public void setLanes(int lanes) {
        this.lanes = lanes;
    }

    public boolean isHasHurdles() {
        return hasHurdles;
    }

    public void setHasHurdles(boolean hasHurdles) {
        this.hasHurdles = hasHurdles;
    }

    @Override
    public String toString() {
        return "Running{" +
                "lanes=" + lanes +
                ", hasHurdles=" + hasHurdles +
                ", secsElapsed=" + secsElapsed +
                ", finalTime=" + finalTime +
                ", distance=" + distance +
                ", homeMeetScore=" + homeMeetScore +
                ", guestMeetScore=" + guestMeetScore +
                ", homeTeam='" + homeTeam + '\'' +
                ", guestTeam='" + guestTeam + '\'' +
                '}';
    }
}
