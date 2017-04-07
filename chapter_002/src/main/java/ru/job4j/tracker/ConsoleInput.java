package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс ConsoleInput -- организация ввода данных с консоли.
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public class ConsoleInput implements Input {

    /** Сканер для ввода данных. */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Задаем вопрос пользователю.
     *
     * @param question      вопрос
     * @return              ответ пользователя
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
