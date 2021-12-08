package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;
import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        playBlackjack();
    }

    public static void playBlackjack(){
        String name = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter player name");
        name = scanner.next();

        Deck deck = new Deck();
        Player player = new Player(name, 500);
        Player computer = new Player("computer", 500);

        deck.deal(player, deck);
        deck.deal(player, deck);
        deck.deal(computer, deck);
        deck.deal(computer, deck);

        Player.printCards(player, deck);
        System.out.println("another card? y/n");
        char newCard = scanner.next().charAt(0);
        while (newCard == 'y'){
            deck.deal(player,deck);
            Player.printCards(player, deck);
            System.out.println("another card? y/n");
            newCard = scanner.next().charAt(0);
        }

        while (Player.computerAI(computer)){
            deck.deal(computer, deck);
            System.out.println("computer hits");
        }

        Player.printCards(player, deck);
        Player.printCards(computer, deck);
        if (player.hand.handValue > 21){
            System.out.println("player busts");
        }
        if (computer.hand.handValue > 21){
            System.out.println("computer busts");
        }

        if (Hand.getHandValue(player.hand) > Hand.getHandValue(computer.hand) || Hand.getHandValue(computer.hand) > 21){
            System.out.println("player wins");
        }
        else if (Hand.getHandValue(player.hand) < Hand.getHandValue(computer.hand) || Hand.getHandValue(player.hand) > 21){
            System.out.println("computer wins");
        }
        else {
            System.out.println("push");}




        //Player.printCards(computer, deck);
    }
}
