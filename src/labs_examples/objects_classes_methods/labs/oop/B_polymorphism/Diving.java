package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Diving extends JudgedSport{
    private double difficulty;

    public Diving(double combinedScore, int numOfJudges, int attempt, int penalty, double homeOverallScore, double guestOverallScore, String homeTeam, String guestTeam, double difficulty) {
        super(combinedScore, numOfJudges, attempt, penalty, homeOverallScore, guestOverallScore, homeTeam, guestTeam);
        this.difficulty = difficulty;
    }

    @Override
    public void startEvent(){
        System.out.println("the dive meet is starting");
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Diving{" +
                "difficulty=" + difficulty +
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
