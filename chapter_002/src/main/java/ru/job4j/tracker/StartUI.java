package ru.job4j.tracker;

/**
 * Класс StartUI -- управляющий класс.
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public class StartUI {
    /** Хранит ссылку на конкретный объект системы ввода/вывода. */
    private Input input;
    /** Собственно трекер для хранения заявок. */
    private Tracker tracker;

    /**
     * Конструктор нового StartUI.
     *
     * @param input   -- система ввода/вывода
     * @param tracker -- наш трекер
     */
    StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Стартовая точка приложения.
     *
     * @param args -- входные аргументы
     */
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input input = new ValidateInput();
//        Input input = new ConsoleInput();
        StartUI startUI = new StartUI(input, tracker);
        startUI.init();
    }

    /**
     * Инициация меню и запуск цикла программы.
     */
    void init() {
        Menu menu = Menu.getInstance();
        int[] range = menu.menuKeys();
        do {
            menu.showMenu();
            menu.select(input.ask("Select: ", range), input, tracker);
        } while (!menu.isGoExit());
    }
}
