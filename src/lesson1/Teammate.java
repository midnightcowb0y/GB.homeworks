package lesson1;

public class Teammate implements Runnable, Jumpable {
    private String name;
    private int runlimit;
    private int jumplimit;
    private boolean isPossible;
    protected String type;

    public Teammate ( String name, int runlimit, int jumplimit )
    {
        this.name = name;
        this.jumplimit = jumplimit;
        this.runlimit = runlimit;
        isPossible = true;
    }

    @Override
    public void jump(int height) {

        if (height <= jumplimit){
            System.out.println(type + name + "перепрыгнул стену и продолжает участие в соревновании.");
        }

        if (height > jumplimit){
            isPossible = false;
        }

    }

    @Override
    public void run(int distance) {

        if (distance <= jumplimit){
            System.out.println(type + name + "пробежал дистанцию и продолжает участие в соревновании.");
        }

        if (distance > jumplimit){
            isPossible = false;
        }

    }
}
