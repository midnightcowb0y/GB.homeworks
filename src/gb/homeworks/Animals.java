package gb.homeworks;

public abstract class Animals
{

    protected float maxRunLength;
    protected float maxSwimLength;
    protected float maxJumpHeight;

    public Animals (float maxRunLength, float maxSwimLength, float maxJumpHeight)
    {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(float length)
    {
        System.out.println("run: " + (length) + " -> " + isPossibleAction(length, maxRunLength));
    }

    public void swim(float length)
    {
        System.out.println("swim: " + (length) + " -> " + isPossibleAction(length, maxSwimLength));
    }

    public void jump(float height)
    {
        System.out.println("jump: " + (height) + " -> " + isPossibleAction(height, maxJumpHeight));
    }

    private boolean isPossibleAction(float actualValue, float maxValue)
    {
        return actualValue <= maxValue;
    }
}
