package labs_examples.objects_classes_methods.labs.oop.C_blackjack.ex01;

public class Player {
    String name;
    Hand hand;
    int potValue;

    public Player(String name, int potValue){
        this.name = name;
        this.potValue = potValue;
    }

    public boolean computerAI(Player player){
        if (player.hand.getScore(player) < 16){
            return true;
        }
        else {return false;}
    }

}
