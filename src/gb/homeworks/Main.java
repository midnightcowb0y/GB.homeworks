package gb.homeworks;

import java.util.Scanner;

public class Main {

        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args)
        {
                System.out.println("Ваша задача угадать число");
                guessNumber(9,3);
                scanner.close();
        }

          static  void guessNumber( int range, int attempts)
        {
                int number = (int) (Math.random() * range);
                int i;
                for (i=1; i<= attempts; i++)
                {
                        System.out.println("Введите число от 0 до " + range);
                        int input_number = scanner.nextInt();
                        if (input_number == number)
                        {
                                System.out.println("Вы угадали!");
                                tryOneMoreTime();
                                break;
                        } else if (input_number > number)
                        {
                                System.out.println("Загаданное число меньше");
                        } else
                        {
                                System.out.println("Загаданное число больше");
                        } if (i == attempts)
                {
                        System.out.println("Вы проиграли!");
                        tryOneMoreTime();
                        break;
                }
                }
        }
        static void tryOneMoreTime()
        {
                System.out.println("Повторить игру еще раз? Для продолжения введите 1, для выхода - любое другое число");
                int input_number = scanner.nextInt();
                if (input_number == 1)
                {
                        guessNumber(9,3);
                }


        }

}















