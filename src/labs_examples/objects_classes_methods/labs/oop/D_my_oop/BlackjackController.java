package labs_examples.objects_classes_methods.labs.oop.D_my_oop;
import java.util.Scanner;


public class BlackjackController {

    public static void main(String[] args) {
        Deck deck = new Deck();
        String playerOneName;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player naem: ");
        playerOneName = scanner.next();

        playBlackJack(deck, playerOneName);




        //System.out.println(deck.toString());


    }

    public static void playBlackJack(Deck deck, String playerOneName){
        Player player1 = new Player(playerOneName, 100);
        Player computer = new Player("computer", 100);
        deck.deal(player1);
        deck.deal(player1);
        deck.deal(computer);
        deck.deal(computer);

        System.out.println(player1.hand.getScore(player1.hand) + " want another?");
        System.out.println(computer.hand.toString());

    }


}
