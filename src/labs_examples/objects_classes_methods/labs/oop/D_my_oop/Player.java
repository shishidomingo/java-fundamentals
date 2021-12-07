package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Player {
    String name;
    Hand hand;
    int potValue;

    public Player(String name, int potValue){
        this.name = name;
        this.potValue = potValue;
        hand = new Hand();
    }

    public boolean computerAI(Hand hand){
        if (Hand.getScore(hand) < 16){
            return true;
        }
        else {return false;}
    }

}
