package Lection3;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i+=1 ) {// В тренировке должно выполниться 5 кругов
            System.out.println("Круг " + i);
            if (i % 2 == 0)
                for (int j= 1; j <=5; j+=1)// Выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
                    // Если да, то присесть 5 раз
                    System.out.println("  Приседаем " + j);

            else
                for(int g = 1; g <= 3; g += 1)// Иначе нужно отжаться 3 раза
                    System.out.println("  Отжимаемся " + g);

            for (int k = 1; k <=7; k +=1)// Независимо от номера круга качаем пресс 7 раз
                System.out.println("  Качаем пресс " + k);

            // Небольшое подбадривание в конце каждого круга
            System.out.println("Хороший темп, так держать!");
        }

        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}
