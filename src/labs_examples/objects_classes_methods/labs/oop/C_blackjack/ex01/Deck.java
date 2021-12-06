package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    protected Card[] cards;
    protected ArrayList<Integer> usedCards;

    public Deck() {
        cards = createNewDeck();
    }

    public Card[] createNewDeck(){
        Card[] newDeck = new Card[52];

        for (int i = 0; i < newDeck.length; i++){
            newDeck[i] = new Card(i+1);
        }
        return newDeck;
    }

    public void deal(Player player){
        Random rand = new Random(51);
        int nextRandom = rand.nextInt();
        for (int i = 0; i < usedCards.size(); i++){
            if (nextRandom != usedCards.get(i)){
                Card newCard = new Card(nextRandom + 1);
                player.hand.addCard(newCard);
                usedCards.add(newCard.cardIndex);
                break;
            }
        }
    }
}
