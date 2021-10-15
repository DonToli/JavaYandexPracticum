package Lection5;

import java.util.Scanner;

public class newFor {
    public static void main(String[] args) {
        // Объявили массив трат за неделю (7 дней)
        double[] expenses = new double[7];

        double expense = 50; // В первый день потрачено 50 рублей

        // Заполнили массив, используя цикл for
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }
        System.out.println("Расходы за неделю успешно занесены в приложение!");
        Scanner scanner = new Scanner(System.in);
        while (true) { // Добавили бесконечный цикл — теперь не страшно ошибаться много раз
            System.out.println("Расходы за какой день вы хотите проверить. Выберите значение от 0 (пн) до 6 (вс).");

            // Считайте ввод пользователя из консоли и сохраните в переменной index
            int index = scanner.nextInt();

            // Проверьте, не допущена ли ошибка
            if ( index < 0) {
                System.out.println("Выбрано неверное значение! Минимальное значение - 0");
            }
            // Если значение меньше нуля,
            // напечатайте "Выбрано неверное значение! Минимальное значение - 0"
            else if ( index >= 7){
                System.out.println("Выбрано неверное значение! Максимальное значение - " + (expenses.length - 1));
            }

            else {

                System.out.println("Потрачено " + expenses[index] + " рублей");
                break;
            }
        }
    }
}

