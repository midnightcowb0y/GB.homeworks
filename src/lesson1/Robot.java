
package lesson1;

public class Robot extends Teammate {
    public Robot(String name, int runlimit, int jumplimit) {
        super(name, runlimit, jumplimit);
        type = "Робот";
    }
}