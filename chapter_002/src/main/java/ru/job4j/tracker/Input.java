package ru.job4j.tracker;

/**
 * Интерфейс для ввода/вывода.
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public interface Input {
    /**
     * Метод "задать вопрос, получить ответ".
     *
     * @param question      вопрос
     * @return              ответ пользователя
     */
    String ask(String question);

    /**
     * Метод "задать вопрос, получить ответ", с указанием возможного диапазона.
     *
     * @param question      вопрос
     * @param range         диапазон возможных значений
     * @return              ответ пользователя
     */
    int ask(String question, int[] range);
}
