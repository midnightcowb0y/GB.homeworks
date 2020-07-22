package gb.homeworks;

public class Cat extends Animals
{
    public Cat(float maxRunLength, float maxJumpHeight)
    {
        super(maxRunLength, 0, maxJumpHeight);
    }

    @Override
    public void swim(float length)
    {
        System.out.println("Cats can't swim!");
    }
}
