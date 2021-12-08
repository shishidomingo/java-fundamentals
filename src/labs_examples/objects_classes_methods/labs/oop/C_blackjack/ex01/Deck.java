package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

    protected Card[] cards;
    protected int nextCard;
    //ArrayList<Integer> usedcards;

    Deck(){
        cards = new Card[52];
        for (int w = 0; w < 52; w++){
            cards[w] = new Card();
        };
        cards = makeNewDeck(cards);
        cards = shuffleDeck(cards);
        nextCard = 0;
    };

    public Card[] makeNewDeck(Card[] cards){
        //Card[] straightDeck = new Card[52];
        for (int i = 0; i < 52; i++){
            cards[i].setCardValue(i+1);
        }

        return cards;
    }

    public Card[] shuffleDeck(Card[] cards){
        Random rand = new Random();
        for (int i = cards.length -1; i > 0; i--){
            int j = rand.nextInt(52);
            Card holder = cards[j];
            cards[j] = cards[i];
            cards[i] = holder;
        }
        return cards;
    }

    public void deal(Player player, Deck deck){
        player.hand.addCard(deck.cards[nextCard], player.hand);
        deck.nextCard++;
    }


}
