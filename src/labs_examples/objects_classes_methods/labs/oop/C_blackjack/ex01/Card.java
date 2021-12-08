package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;

public class Card {
    //char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;

    public Card(){
        //Card card = new Card();
        cardValue = 0;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
}
