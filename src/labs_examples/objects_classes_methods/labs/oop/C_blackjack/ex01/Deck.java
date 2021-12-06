package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;
import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    protected Card[] cards;
    protected ArrayList<Integer> usedCards;

    public Deck() {
        this.cards = fillDeck();
        this.usedCards = usedCards;
    }

    public Card[] fillDeck(){
        Card[] newDeck = new Card[52];
        for (int i = 0; i < 52; i++){
            newDeck[i] = new Card(((i+4)/4), i);
                }
        return newDeck;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(int cardPos) {
        usedCards.add(cardPos);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }
}
