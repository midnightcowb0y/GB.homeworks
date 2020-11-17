package gb.homeworks;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Teammate> team = new ArrayList<>();
        team.add( new Robot("H3PO", 100, 1));
        team.add(new Human("Игнат", 1000, 2));
        team.add(new Cat("Барсик", 10,4));

    }
}
