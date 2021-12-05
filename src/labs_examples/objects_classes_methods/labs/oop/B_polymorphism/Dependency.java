package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Dependency {

    Sport sport;
    public Dependency(Sport sport){
        this.sport = sport;
    }

    public void testMethods(){
        sport.startEvent();
        sport.endGame();
        sport.getWinner();
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
