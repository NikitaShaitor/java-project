package ru.otus.java.basic;
import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру 'Угадай число'\nВыберите уровень сложности:\n1 - Легко\n2 - Средне\n3 - Трудно");
        int difficulty = scanner.nextInt();
        // Переменная для попыток
        int triesCount;
        // Переменная для максимального загаданного числа
        int max;
        // Переменная для показа подсказок
        boolean showHint = true;
        if (difficulty == 1) {
            max = 10;
            triesCount = 3;
            System.out.println("Выбран легкий уровень сложности");
        } else if (difficulty == 2) {
            max = 15;
            triesCount = 3;
            System.out.println("Выбран средний уровень сложности");
        } else if (difficulty == 3) {
            max = 30;
            triesCount = 3;
            showHint = false;
            System.out.println("Выбран трудный уровень сложности");
        } else {
            System.out.println("Вот и первая пасхалка\nУдачи!)");
            max = 100_000;
            triesCount = 2;
            showHint = false;
        }


        // Рандомная переменная. Для загадывания числа от 1 до max
        int aiNumber = (int)(Math.random() * max) + 1;

        System.out.println("Компьютер загадал число 1-" + max + ".\nПопробуйте отгадать!\nУ вас есть " + triesCount + " попыток");

        // Сделал цикл, что бы гонять по кругу
        while (true) {
            // Прошу дать ответ
            int answer;
            do {
                answer = scanner.nextInt();
            } while (answer < 1 || answer > max);

            // Проверка правильности ответа
            if (answer == aiNumber) {
                System.out.println("Вы победили!");
                break;
            }
            // Сделал что бы попытки при цикле уменьшались + проверку на оставшиеся попытки
            triesCount--;
            if (triesCount == 0) {
                System.out.println("Попыток больше не осталось.\nВы проиграли\nЗагаданное число: " + aiNumber);
                break;
            }

            // Добавил логику для того что бы писались подсказки + Добавил что бы их не было при !showHint
            if (!showHint) {
                System.out.println("\"Не угадали. Осталось попыток: \" + triesCount");
            } else if (answer < aiNumber) {
                            System.out.println("Не угадали. Осталось попыток: " + triesCount + "\nЗагаданное число больше");
            } else {
                System.out.println("Не угадали. Осталось попыток: " + triesCount + "\nЗагаданное число меньше");
            }
        }
        // Надпись, если попытки завершились
        System.out.println("Игра завершена!");
    }
}
