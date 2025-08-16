package ru.otus.java.basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прошу ввести первое число и запоминаю его в переменную a
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        // Прошу выбрать операцию из списка и запоминаю в переменную operation
        System.out.println("Выберите операцию:\n1 - Сложить\n2 - Вычесть\n3 - Умножить\n4 - Разделить");
        int operation = scanner.nextInt();
        // Прошу ввести второе число и запоминаю его в переменную b
        System.out.println("Введите второе число");
        int b = scanner.nextInt();


        // Сделал проверку на ввод операции + что делать с операциями и выводом
        if (operation == 1){
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if (operation == 2) {
            int result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if (operation == 3) {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        } else if (operation == 4) {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        } else {
            System.out.println("Выбрана неизвестная операция\nРабота калькулятора завершена");
        }
    }
}
