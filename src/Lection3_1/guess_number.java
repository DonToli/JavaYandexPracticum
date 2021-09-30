package Lection3_1;

import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000); // Генерирует новое число от 0 до 1000

        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("Я загадал число от 0 до 1000.");
        System.out.println("Ваш ход:");

        while (randomInt != userInput) {// Напишите условие цикла для запуска игры

            userInput = scanner.nextInt(); // В этой переменной должен сохраняться ввод пользователя

            if (userInput > randomInt) { // Условие проверяется в цикле
                System.out.println("Меньше");
            } else if (userInput < randomInt) {// Второе условие
                System.out.println("Больше");
            } else// Печатаем, когда число угадано
                System.out.println("Вы великолепны! Именно это я загадал.");
        }
    }

}