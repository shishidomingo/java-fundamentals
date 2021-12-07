package labs_examples.objects_classes_methods.labs.oop.D_my_oop;
import java.util.ArrayList;

public class Hand {
    protected static ArrayList<Card> cards;
    protected int handValue;

    public Hand(){
        cards = new ArrayList<Card>();
        handValue = 0;
    }

    public void addCard(Card nextCard){
        cards.add(nextCard);
    }

    public static int getScore(Hand hand){
        int score = 0;
        for (int i = 0; i < cards.size(); i++){
            score = score + cards.get(i).cardValue;
        }
        return score;
    }

    public boolean isBust(Player player){
        if (getScore(this) < 21){
            return false;
        }
        else {return true;}
    }



}
