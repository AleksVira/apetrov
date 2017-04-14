package ru.job4j.tracker;

/**
 * Класс MenuOutException -- выбрасываемая ошибка, выход за допустимые значения.
 *
 * @author apetrov
 * @version 1
 * @since 10.04.2017
 */
public class MenuOutException extends RuntimeException {

    /** Просто конструктор.
     *
     * @param message -- текст сообщения об ошибке
     * */
    public MenuOutException(String message) {
        super(message);
    }
}
