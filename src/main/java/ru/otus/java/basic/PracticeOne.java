package ru.otus.java.basic;
import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Рандомная переменная. Для загадывания числа от 1 до 10
        int aiNumber = (int)(Math.random() * 10) + 1;
        System.out.println("Компьютер загадал число 1-10.\nПопробуйте отгадать!");

        // Прошу дать ответ
        int answer;
        do {
            System.out.println("Введите число 1-10");
            answer = scanner.nextInt();
        } while (answer < 1 || answer > 10);

        // Проверка правильности ответа
        if (answer == aiNumber) {
            System.out.println("Вы победили!");
        } else {
            System.out.println("Вы проиграли\nЗагаданное число: " + aiNumber);
        }

    }
}
