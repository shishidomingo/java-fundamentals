package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;

public class Card {
    static char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;

    public Card(){
        cardValue = 0;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public static int getCardValue(Card card) {
        char thisCardFace = getFace(card);
        int cardValue;
        switch (thisCardFace) {
            case 'A':
                cardValue = 1;
                break;
            case '2':
                cardValue = 2;
            break;
            case '3':
                cardValue = 3;
            break;
            case '4':
                cardValue = 4;
            break;
            case '5':
                cardValue = 5;
            break;
            case '6':
                cardValue = 6;
            break;
            case '7':
                cardValue = 7;
            break;
            case '8':
                cardValue = 8;
            break;
            case '9':
                cardValue = 9;
            break;
            case 'J':
                cardValue = 10;
            break;
            case 'Q':
                cardValue = 10;
            break;
            case 'K':
                cardValue = 10;
            break;
            default: cardValue = -1;
        }
        return cardValue;

    }

    public static char getFace(Card card){
        int indexToFace = (card.cardValue) / 4;
        char cardFace;
        char[] face = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K'};
        cardFace= face[indexToFace];
        return cardFace;
    }

    public static char getSuit(Card card){
        int indexToSuit = card.cardValue % 4;
        char cardSuit;
        cardSuit = suit[indexToSuit];
        return cardSuit;
    }
}
