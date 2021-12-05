package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Hockey extends StickAndBallSport{

    private int homeHits;
    private int guestHits;
    private int homeAssists;
    private int guestAssists;

    public Hockey(int numOfPlayersPerTeam, int numOfPeriods, String homeTeam, int homeScore, int guestScore, String guestTeam, String currentLeader, int homeHits, int guestHits, int homeAssists, int guestAssists) {
        super(numOfPlayersPerTeam, numOfPeriods, homeTeam, homeScore, guestScore, guestTeam, currentLeader);
        this.homeHits = homeHits;
        this.guestHits = guestHits;
        this.homeAssists = homeAssists;
        this.guestAssists = guestAssists;
    }

    @Override
    public void startEvent(){
        System.out.println("puck drop");
    }

    @Override
    public void endGame(){
        System.out.println("final airhorn");
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

    public int getHomeAssists() {
        return homeAssists;
    }

    public void setHomeAssists(int homeAssists) {
        this.homeAssists = homeAssists;
    }

    public int getGuestAssists() {
        return guestAssists;
    }

    public void setGuestAssists(int guestAssists) {
        this.guestAssists = guestAssists;
    }

    @Override
    public String toString() {
        return "Hockey{" +
                "homeHits=" + homeHits +
                ", guestHits=" + guestHits +
                ", homeAssists=" + homeAssists +
                ", guestAssists=" + guestAssists +
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
