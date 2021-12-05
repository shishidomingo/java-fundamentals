package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class DownhillSkiing extends TimedSport{

    int numOfGates;
    int faults;

    public DownhillSkiing(double secsElapsed, double finalTime, int distance, int homeMeetScore, int guestMeetScore, String homeTeam, String guestTeam, int numOfGates, int faults) {
        super(secsElapsed, finalTime, distance, homeMeetScore, guestMeetScore, homeTeam, guestTeam);
        this.numOfGates = numOfGates;
        this.faults = faults;
    }

    @Override
    public void startEvent(){
        System.out.println("and the gate is open");
    }

    public int getNumOfGates() {
        return numOfGates;
    }

    public void setNumOfGates(int numOfGates) {
        this.numOfGates = numOfGates;
    }

    public int getFaults() {
        return faults;
    }

    public void setFaults(int faults) {
        this.faults = faults;
    }

    @Override
    public String toString() {
        return "DownhillSkiing{" +
                "numOfGates=" + numOfGates +
                ", faults=" + faults +
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
