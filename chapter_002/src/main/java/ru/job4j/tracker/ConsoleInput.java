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

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range.");
        }
    }
}
