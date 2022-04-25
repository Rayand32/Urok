import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.загадать число компьютером
        //2.ввести число пользователем
        //3.проверить больше меньше или равно пользовательское число компьютерному
        //4.1.если число пользоваталя больше или меньше, то вывести подсказку и перейти на шаг 2
        //4.2.если число пользователя равно компьютероному, то остановить игру и вывести сообщение о победе
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        int compNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;//10..100
        int userNumber;
        int countTries = 0;
        int leftSide = minNumber;
        int rightSide = maxNumber;

        System.out.println("Игра угадай число, надо угадать заданое число компьютером");

        do {
            System.out.print("Введите число от " + leftSide+" до " + rightSide + ": ");
            userNumber = scanner.nextInt();

            countTries++;

            if (userNumber > compNumber) {
                System.out.println("введите поменьше");
                rightSide = userNumber;
            } else if (userNumber < compNumber) {
                System.out.println("введите побольше");
                leftSide = userNumber;
            }
        } while (userNumber != compNumber);

        System.out.println("вы угадали! за " + countTries + "попыток");

        if (countTries <= 3) {
            System.out.println("Вы гений");
        } else if (countTries >= 4 && countTries <= 6) {
            System.out.println("Вы мастер");
        } else if (countTries >= 7 && countTries <= 10) {
            System.out.println("играй лучше");
        } else {
            System.out.println("лошара");
        }
    }
}