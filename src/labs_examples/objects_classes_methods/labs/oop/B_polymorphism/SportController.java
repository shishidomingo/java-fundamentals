package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class SportController {

    public static void main(String[] args) {
        Baseball dodgersvspadres = new Baseball(9, 9, "dodgers", 19, 2, "padres", "dodgers", 26, 2, 0, 8 );
        Diving usavschile = new Diving(21.3, 3, 1, 65, 185,162, "usa", "chile", 8.5);
        DownhillSkiing vonnvsrodriguez = new DownhillSkiing(112.67, 119.25, 1250, 91, 88, "vonn", "rodriguez", 32, 0);
        Gymnastics bilesvsmaroney = new Gymnastics(339.925, 3, 4, 1, 339.925, 321.85, "biles", "maroney", 1);
        Hockey usavscanada = new Hockey(6, 3, "usa", 6, 3, "canada", "usa", 8, 4, 9, 3);
        Running hundredMeterFinal = new Running(9.85, 9.85, 100, 45, 42, "oregon", "oregon state", 6, false);

        System.out.println(dodgersvspadres.toString());
        System.out.println(usavschile.toString());
        System.out.println(vonnvsrodriguez.toString());
        System.out.println(bilesvsmaroney.toString());
        System.out.println(usavscanada.toString());
        System.out.println(hundredMeterFinal.toString());

        dodgersvspadres.startEvent();
        usavschile.startEvent();
        vonnvsrodriguez.startEvent();
        bilesvsmaroney.startEvent();
        usavscanada.startEvent();
        hundredMeterFinal.startEvent();

        dodgersvspadres.addHomePoint();
        dodgersvspadres.addGuestPoint();
        System.out.println(dodgersvspadres.getWinner() + " " + dodgersvspadres.homeScore + " " + dodgersvspadres.guestScore);
        dodgersvspadres.endGame();
        usavschile.endGame();
        vonnvsrodriguez.endGame();
        bilesvsmaroney.endGame();
        usavscanada.endGame();
        hundredMeterFinal.endGame();




    }
}
