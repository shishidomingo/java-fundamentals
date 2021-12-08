package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;

public class Player {
    String name;
    Hand hand;
    int potValue;

    Player(String playerName, int pot){
        name = playerName;
        potValue = pot;
        hand = new Hand();
    }

    public static void printCards(Player player, Deck deck){
        System.out.print(player.name + " hand: ");
        for (int i = 0; i < player.hand.cards.size(); i++){
            System.out.print(player.hand.cards.get(i).cardValue + " ");
        }
        System.out.println();

    }

}
