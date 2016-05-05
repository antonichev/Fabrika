package ua.od.fabrika.antonichev.HW4;

import java.util.Random;
import java.util.Scanner;

/**
 * Реализовать программу «Предсказатель». Пользователь вводит вопрос.
 * Программа выдаёт случайный ответ из набора заранее предусмотренных
 * ответов (5 положительных, 5 отрицательных, 10 нейтральных вариантов).
 */
public class HW4_task13_Prediction {
    public static void main(String[] args) {
        String[] answers = {"Да!",
                            "Нет!",
                            "Пока не ясно, попробуй снова",
                            "100%!",
                            "Сейчас нельзя предсказать",
                            "Конечно!",
                            "Вероятнее всего",
                            "Сконцентрируйся и спроси опять",
                            "Даже не думай",
                            "Спроси позже",
                            "Нельзя",
                            "Верно!",
                            "Непонятно",
                            "Скорее всего \"Нет\"",
                            "Перспективы не очень хорошие",
                            "Скорее всего \"Да\"",
                            "Неприменно!",
                            "Даже не знаю...",
                            "Может быть",
                            "Весьма сомнительно"};

        System.out.println("Задайте свой вопрос:");
        Scanner input = new Scanner(System.in);

        Random random = new Random();

        input.next();

        System.out.println("\nОтвет:");
        System.out.println(answers[random.nextInt(20)]);
    }
}
