package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Card {

    protected char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    protected int cardValue;
    protected int cardIndex;

    public Card(int cardIndex) {

        this.cardIndex = cardIndex;
    }

    public int getCardValue(Card card){
        int cardIndexDivided = ((card.cardIndex) + 4) / 4;
        if (cardIndexDivided > 10){
            cardValue = 10;
        }
        return cardValue;
    }

    public char getSuit(Card card){
        int cardSuitCounter = card.cardIndex % 4;
        char cardSuit = suit[cardSuitCounter];
        return cardSuit;
    }

}