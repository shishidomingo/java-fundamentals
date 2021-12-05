package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Baseball extends StickAndBallSport{
    private int homeHits;
    private int guestHits;
    private int homeErrors;
    private int guestErrors;

    public Baseball(int numOfPlayersPerTeam, int numOfPeriods, String homeTeam, int homeScore, int guestScore, String guestTeam, String currentLeader, int homeHits, int guestHits, int homeErrors, int guestErrors) {
        super(numOfPlayersPerTeam, numOfPeriods, homeTeam, homeScore, guestScore, guestTeam, currentLeader);
        this.homeHits = homeHits;
        this.guestHits = guestHits;
        this.homeErrors = homeErrors;
        this.guestErrors = guestErrors;
    }

    @Override
    public void startEvent(){
        System.out.println("play ball!");
    }

    public void seventhInningStretch(){
        System.out.println("root root root for the Dodgers");
    }

    public int getHomeHits() {
        return homeHits;
    }

    public void setHomeHits(int homeHits) {
        this.homeHits = homeHits;
    }

    public int getGuestHits() {
        return guestHits;
    }

    public void setGuestHits(int guestHits) {
        this.guestHits = guestHits;
    }

    public int getHomeErrors() {
        return homeErrors;
    }

    public void setHomeErrors(int homeErrors) {
        this.homeErrors = homeErrors;
    }

    public int getGuestErrors() {
        return guestErrors;
    }

    public void setGuestErrors(int guestErrors) {
        this.guestErrors = guestErrors;
    }

    @Override
    public String toString() {
        return "Baseball{" +
                "homeHits=" + homeHits +
                ", guestHits=" + guestHits +
                ", homeErrors=" + homeErrors +
                ", guestErrors=" + guestErrors +
                ", numOfPlayersPerTeam=" + numOfPlayersPerTeam +
                ", numOfPeriods=" + numOfPeriods +
                ", homeTeam='" + homeTeam + '\'' +
                ", homeScore=" + homeScore +
                ", guestScore=" + guestScore +
                ", guestTeam='" + guestTeam + '\'' +
                ", currentLeader='" + currentLeader + '\'' +
                '}';
    }
}
