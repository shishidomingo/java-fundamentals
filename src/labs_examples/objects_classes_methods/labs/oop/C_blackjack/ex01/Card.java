package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;

public class Card {

    static char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;
    int cardPos;

    public Card(int cardValue, int cardPos) {
        this.cardValue = cardValue;
        this.cardPos = cardPos;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public int getCardPos() {
        return cardPos;
    }

    public void setCardPos(int cardPos) {
        this.cardPos = cardPos;
    }
}