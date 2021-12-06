package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;
import java.util.ArrayList;
import java.util.Random;

public class Hand {
    protected ArrayList<Card> cards;
    protected int handValue;

    public Hand(Card card1, Card card2){
        cards.add(card1);
        cards.add(card2);

    }

    public void addCard(Card nextCard){
        cards.add(nextCard);
    }

    public int getScore(Player player){
        int score = 0;
        for (int i = 0; i < cards.size(); i++){
            score = score + cards.get(i).cardValue;
        }
        return score;
    }

    public boolean isBust(Player player){
        if (player.hand.getScore(player) < 21){
            return false;
        }
        else {return true;}
    }

    

}
