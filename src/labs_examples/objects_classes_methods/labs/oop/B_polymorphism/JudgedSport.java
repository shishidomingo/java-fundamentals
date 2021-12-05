package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class JudgedSport implements Sport{

    protected double combinedScore;
    protected int numOfJudges;
    protected int attempt;
    protected int penalty;
    protected double homeOverallScore;
    protected double guestOverallScore;
    protected String homeTeam;
    protected String guestTeam;

    public JudgedSport(double combinedScore, int numOfJudges, int attempt, int penalty, double homeOverallScore, double guestOverallScore, String homeTeam, String guestTeam) {
        this.combinedScore = combinedScore;
        this.numOfJudges = numOfJudges;
        this.attempt = attempt;
        this.penalty = penalty;
        this.homeOverallScore = homeOverallScore;
        this.guestOverallScore = guestOverallScore;
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
    }

    public void startEvent(){
        System.out.println("the match is starting");
    }

    public void addHomePoint(){
        homeOverallScore++;
    }

    public void addGuestPoint(){
        guestOverallScore++;
    }

    public void endGame(){
        System.out.println("match has ended");
    }

    public String getWinner(){
        if (homeOverallScore > guestOverallScore){
            return homeTeam;
        }

        else {return guestTeam;}
    }
}
