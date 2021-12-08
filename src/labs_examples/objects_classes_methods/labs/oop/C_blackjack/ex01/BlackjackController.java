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

    }
}
