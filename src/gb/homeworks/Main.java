package gb.homeworks;

public class Main {

    public static void main(String[] args) {
        System.out.println(calc(2, 3, 4, 5));
        System.out.println(meth(0, 1));
        numb (3);
        System.out.println( negative(2));
        greetings("Иванушка");
    }

    static int calc(int a, int b, int c, int d) {

        return a * (b + (c / d));
    }

    static boolean meth(int a1, int b1) {

        return 10 >= a1 + b1 && a1 + b1 <= 20;
    }

    static void numb(int x) {
        if (x >= 0) {
            System.out.println("Число является положительным");
        } else {
            System.out.println("Число является отрицательным");
        }
    }

    static boolean negative (int n) {
        if (n < 0) {
            return true;
        }
        return false;
    }
    static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }


}






