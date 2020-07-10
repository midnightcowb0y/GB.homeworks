package gb.homeworks;

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил Человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O))
            {
                System.out.println("Победил Искусcтвенный Разум");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
   static boolean checkWin(char symb)
   {
        int d1; //* первая  диагональ
        int d2; //* вторая диагональ
        int row; //* ряды
        int col; //* столбцы
        for (int i = 0; i < SIZE; i++)
        {
            row = 0; col = 0; //*проверяем по рядам и столбцам
            for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == symb)
                {
                    row++;
                }
                if (map[j][i] == symb)
                {
                    col++;
                }
            }
            if (row == DOTS_TO_WIN|| col == DOTS_TO_WIN)
            {
                return true;
            }
        }
        d1 = 0; d2 = 0;  //* проверяем по диагоналям
        for (int i = 0; i < SIZE; i++)
        {
            if (map[i][i] == symb)
            {
                d1++;
            }
            if (map[i][SIZE - i - 1] == symb)
            {
                d2++;
            }
        }
        if (d1 == DOTS_TO_WIN || d2 == DOTS_TO_WIN)
        {
            return true;
        }
        return false;
    }

    public static boolean isMapFull()
    {
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn()
    {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn()
    {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = getNumberFromScanner() -1;
            y = getNumberFromScanner() -1;

        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public  static int getNumberFromScanner()
    {
        Scanner scanner = new Scanner(System.in);


        do
        {
            if (scanner.hasNextInt())
            {
                return scanner.nextInt();
            }

            System.out.println("Введите целое число!");
            scanner.nextLine();
        }
        while (true);
    }
    public static boolean isCellValid(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap()
    {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


    }

