package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;
import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int handValue;

    Hand(){
        cards = new ArrayList<Card>();
        handValue = 0;
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public int getHandValue(Hand hand){
        int thisHandValue = 0;
        for (int i = 0; i < hand.cards.size(); i++){
            thisHandValue += hand.cards.get(i).cardValue;


        }
    }

}
