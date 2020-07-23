package gb.homeworks;

public class Cat
{
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p)

    { if ( p.food >= appetite)
    {
        p.decreaseFood(appetite);
        satiety = true;
    }
    else
    {
        p.addFood();
    }
    }


    public void printInfo()
    {
        System.out.println("Cat's " + name + " satiety is: " + satiety);
    }


}
