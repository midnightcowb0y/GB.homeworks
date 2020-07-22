package gb.homeworks;


public class Main {

    public static void main(String[] args)
    {
        Cat Tom = new Cat(200, 2);
        Dog Pluto = new Dog(500, 10, 0.5f);

        System.out.println("Tom:");

        Tom.run(17);
        Tom.run(777);
        Tom.swim(100);
        Tom.jump(7);
        Tom.jump(2);

        System.out.println("Pluto:");

        Pluto.run(150);
        Pluto.run(700);
        Pluto.swim(9);
        Pluto.swim(11);
        Pluto.jump(0.3f);
        Pluto.jump(1);

        }

        }






