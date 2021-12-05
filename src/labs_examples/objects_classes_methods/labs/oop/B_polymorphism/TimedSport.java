package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class TimedSport {

    protected double secsElapsed;
    protected double finalTime;
    protected int distance;
    protected int homeMeetScore;
    protected int guestMeetScore;
    protected String homeTeam;
    protected String guestTeam;

    public TimedSport(double secsElapsed, double finalTime, int distance, int homeMeetScore, int guestMeetScore, String homeTeam, String guestTeam) {
        this.secsElapsed = secsElapsed;
        this.finalTime = finalTime;
        this.distance = distance;
        this.homeMeetScore = homeMeetScore;
        this.guestMeetScore = guestMeetScore;
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
    }

    public void startEvent(){
        System.out.println("the race has begun");
    }

    public void addHomePoint(){
        homeMeetScore++;
    }

    public void addGuestPoint(){
        guestMeetScore++;
    }

    public void endGame(){
        System.out.println("and across the line");
    }

    public String getWinner(){
        if (homeMeetScore > guestMeetScore){
            return homeTeam;
        }
        else {return guestTeam;}
    }

    public double getSecsElapsed() {
        return secsElapsed;
    }

    public void setSecsElapsed(double secsElapsed) {
        this.secsElapsed = secsElapsed;
    }

    public double getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(double finalTime) {
        this.finalTime = finalTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getHomeMeetScore() {
        return homeMeetScore;
    }

    public void setHomeMeetScore(int homeMeetScore) {
        this.homeMeetScore = homeMeetScore;
    }

    public int getGuestMeetScore() {
        return guestMeetScore;
    }

    public void setGuestMeetScore(int guestMeetScore) {
        this.guestMeetScore = guestMeetScore;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(String guestTeam) {
        this.guestTeam = guestTeam;
    }
}
