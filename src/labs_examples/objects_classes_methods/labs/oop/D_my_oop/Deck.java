package labs_examples.objects_classes_methods.labs.oop.D_my_oop;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

    protected Card[] cards;
    protected ArrayList<Integer> usedCards;

    public Deck() {

        cards = createNewDeck();
        usedCards = new ArrayList<Integer>();
    }

    public Card[] createNewDeck(){
        Card[] newDeck = new Card[52];

        for (int i = 0; i < newDeck.length; i++){
            newDeck[i] = new Card(i+1);
        }
        return newDeck;
    }

    public void deal(Player player){
        Random rand = new Random();
        int nextRandom = rand.nextInt(51);

        Card newCardOne = new Card(nextRandom + 1);
        player.hand.addCard(newCardOne);
        usedCards.add(newCardOne.cardIndex);
        for (int i = 0; i < 51; i++){
            if (nextRandom != usedCards.get(i)){
                Card newCardTwo = new Card(nextRandom + 1);
                player.hand.addCard(newCardTwo);
                usedCards.add(newCardTwo.cardIndex);
                break;
            }
        }
    }
}
