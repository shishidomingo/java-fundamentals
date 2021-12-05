package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Gymnastics extends JudgedSport{

    private int round;

    public Gymnastics(double combinedScore, int numOfJudges, int attempt, int penalty, double homeOverallScore, double guestOverallScore, String homeTeam, String guestTeam, int round) {
        super(combinedScore, numOfJudges, attempt, penalty, homeOverallScore, guestOverallScore, homeTeam, guestTeam);
        this.round = round;
    }

    @Override
    public void startEvent() {
        System.out.println("the floor rotation has begun");
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "Gymnastics{" +
                "round=" + round +
                ", combinedScore=" + combinedScore +
                ", numOfJudges=" + numOfJudges +
                ", attempt=" + attempt +
                ", penalty=" + penalty +
                ", homeOverallScore=" + homeOverallScore +
                ", guestOverallScore=" + guestOverallScore +
                ", homeTeam='" + homeTeam + '\'' +
                ", guestTeam='" + guestTeam + '\'' +
                '}';
    }
}
