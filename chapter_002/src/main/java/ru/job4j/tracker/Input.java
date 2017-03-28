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
}
