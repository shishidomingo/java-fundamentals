package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;

public class Player {
    String name;
    Hand hand;
    int potValue;
    static int totalGames;
    int wins;

    Player(String playerName, int pot){
        name = playerName;
        potValue = pot;
        hand = new Hand();
        wins = 0;
    }

    public static void printCards(Player player, Deck deck){
        System.out.print(player.name + " hand: ");
        for (int i = 0; i < player.hand.cards.size(); i++){
            char suit = Card.getSuit(player.hand.cards.get(i));
            char face = Card.getFace(player.hand.cards.get(i));
            System.out.print(suit);
            System.out.print(face);
            System.out.print(' ');
        }
        System.out.println();

    }

    public static boolean computerAI(Player player){
        if (Hand.getHandValue(player.hand) < 16){
            return true;
        }
        return false;
    }

}
