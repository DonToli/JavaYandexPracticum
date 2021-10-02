package Lection4;

public class forWhile {
    public static void main(String[] args) {
        String[] currencies = {"USD", "EUR", "JPY", "RUB"}; // Массив
// Цикл начинается с 0 и продолжается c шагом в единицу, пока i строго меньше длины массива
        for (int i = 0; i < currencies.length; i++) {
// Переменная итерирования ставится на место индекса, так все элементы будут напечатаны
            System.out.println("Поддерживаемая валюта: " + currencies[i]);
        }
    }
}