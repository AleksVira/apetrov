package ru.job4j.tracker;

/**
 * Класс StubInput -- класс для симуляции ввода с консоли.
 *
 * @author apetrov
 * @version 1
 * @since 03.04.2017
 */
public class StubInput implements Input {

    /** Массив, имитирующий ввод данных пользователем. */
    private String[] answers;
    /** Счетчик для прохождения по массиву. */
    private int position = 0;

    /**
     * Конструктор StubInput.
     *
     * @param answers массив пользовательского ввода
     */
    StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return answers[position++];
    }

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        return key;
    }
}
