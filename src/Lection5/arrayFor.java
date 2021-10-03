package Lection5;

import java.util.Random;

public class arrayFor {
    public static void main(String[] args) {
        // Объявите пустой массив трат за неделю (7 дней)
        int[] expenses = new int[7];

        Random random = new Random(); // Генерирует случайное число

        // Допишите условие цикла for, чтобы заполнить массив случайными тратами
        for (int i=0; i < expenses.length ; i++) {
            expenses[i] = random.nextInt(1000);
        }

        System.out.println("Траты за неделю:");
        // Выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено рублей: ..."
        //for (int day = 0; day <= 6; day++) {
        int day=0;
        for (int i = 0; i < expenses[i]; i++) {
            day+=1;
            System.out.println("День " + day + ". Потрачено рублей: " + expenses[i]);
            }
        int sum = 0;
        // Посчитайте и выведите сумму трат за неделю — используйте цикл и здесь
        for(int i = sum; i < expenses[i]; i++ )
            sum = sum + expenses[i];

        System.out.println("Траты в рублях за неделю: " + sum);
    }
}

