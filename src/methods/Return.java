package methods;

public class Return {
    public static void main(String[] args) {

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};
        sayHello("Пиксель!");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpenses(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));
        sayEnjoyMeal("Пиксель!");
        sayHello("Байт!");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + findExpensesSums(feedExpensesHamster));
        sayEnjoyMeal("Байт!");

    }

    public static void sayHello(String name) {
        System.out.println("Привет, " + name);
    }

    public static double findMaxExpenses(double[] feedExpensesCat) {
        double maxFeedExpenseCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            if (feedExpensesCat[i] > maxFeedExpenseCat)
                maxFeedExpenseCat = feedExpensesCat[i];
        }
        return maxFeedExpenseCat;
    }
    public static double findMaxExpense(double[] feedExpensesHamster) {
        double maxFeedExpenseHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            if (feedExpensesHamster[i] > maxFeedExpenseHamster) {
                maxFeedExpenseHamster = feedExpensesHamster[i];
            }
        }
        return maxFeedExpenseHamster;
    }
    public static double findExpensesSum(double[] feedExpensesCat) {
        double sumFeedCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            sumFeedCat = sumFeedCat + feedExpensesCat[i];
        }
        return sumFeedCat;
    }
    public static double findExpensesSums(double[] feedExpensesHamster) {
        double sumFeedHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            sumFeedHamster = sumFeedHamster + feedExpensesHamster[i];
        }
        return sumFeedHamster;
    }

    public static void sayEnjoyMeal(String name) {
        System.out.println("Приятного аппетита, " + name);
    }
}