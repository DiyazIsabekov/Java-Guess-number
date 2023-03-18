import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Генерация случайного числа в диапазоне от 10 до 1000
        int maxRange = rand.nextInt(991) + 10;
        System.out.println("Загадайте число от 10 до " + maxRange);

        while (true) {
            // Варианты действий: Загадал, Выход
            System.out.println("1. Загадал\n2. Выход");

            int choice = input.nextInt();
            if (choice == 1) {
                // Вычисление середины диапазона
                int min = 10;
                int max = maxRange;
                int guess = (max + min) / 2;
                char answer = ' ';
                int count = 1; // Счетчик попыток

                while (answer != 'y') {
                    // Вывод предположения программы
                    System.out.print("Вы загадали " + guess + "? ");

                    // Варианты действий: Больше, Меньше, Угадал, Выход
                    System.out.println("\n1. Больше\n2. Меньше\n3. Угадал\n4. Выход");

                    int option = input.nextInt();
                    switch (option) {
                        case 1:
                            // Если загаданное число больше угаданного
                            min = guess + 1;
                            break;
                        case 2:
                            // Если загаданное число меньше угаданного
                            max = guess - 1;
                            break;
                        case 3:
                            // Поздравление пользователя с угадыванием числа и отображение количества
                            // попыток
                            System.out
                                    .println("Я угадал число " + guess + " за " + count + " попыток! Спасибо за игру.");
                            return;
                        case 4:
                            // Выход из программы
                            return;
                        default:
                            // Вывод сообщения об ошибке
                            System.out.println("Некорректный ввод! Попробуйте еще раз.");
                            continue;
                    }

                    // Вычисление новой середины диапазона
                    guess = (max + min) / 2;
                    count++; // Увеличение счетчика попыток
                }
            } else if (choice == 2) {
                // Выход из программы
                return;
            } else {
                // Вывод сообщения об ошибке
                System.out.println("Некорректный ввод! Попробуйте еще раз.");
            }
        }
    }
}

// Для меня человека который еле еле учит JS и библиотеки к нему, было немного
// нелегко, но думаю я справился
// Исабеков Дияз ПКС 1-20