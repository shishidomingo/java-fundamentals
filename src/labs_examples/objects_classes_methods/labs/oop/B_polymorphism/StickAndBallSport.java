package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class StickAndBallSport implements Sport{

        protected int numOfPlayersPerTeam;
        protected int numOfPeriods;
        protected String homeTeam;
        protected int homeScore;
        protected int guestScore;
        protected String guestTeam;
        protected String currentLeader;

    public StickAndBallSport(int numOfPlayersPerTeam, int numOfPeriods, String homeTeam, int homeScore, int guestScore, String guestTeam, String currentLeader) {
        this.numOfPlayersPerTeam = numOfPlayersPerTeam;
        this.numOfPeriods = numOfPeriods;
        this.homeTeam = homeTeam;
        this.homeScore = homeScore;
        this.guestScore = guestScore;
        this.guestTeam = guestTeam;
        this.currentLeader = currentLeader;
    }

    public void startEvent(){
        System.out.println("starting game now");
    }

    public void addHomePoint(){
        homeScore++;
    }

    public void addGuestPoint(){
        guestScore++;
    }

    public void endGame(){
        System.out.println("the game has ended");
    }

    public String getWinner(){
        if (homeScore > guestScore){
            return homeTeam;
        }

        else {return guestTeam;}
    }




}
