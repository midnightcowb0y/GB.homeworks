package gb.homeworks;

import java.util.Random;

public class Plate {

    public int food;
    private int foodToAdd;

    public Plate(int food)
    {
        this.food = food;
    }
    public void decreaseFood(int n)

    {
        food -= n;
    }

    public void addFood ()
    {
        Random random = new Random();

        int foodToAdd = random.nextInt(101);
        food = food + foodToAdd;
    }

}
