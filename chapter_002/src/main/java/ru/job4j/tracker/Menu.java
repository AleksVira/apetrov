package ru.job4j.tracker;

import ru.job4j.tracker.actions.Action;
import ru.job4j.tracker.actions.ExitProgram;
import ru.job4j.tracker.actions.FindItemById;
import ru.job4j.tracker.actions.FindItemsByName;
import ru.job4j.tracker.actions.DeleteItem;
import ru.job4j.tracker.actions.AddItem;
import ru.job4j.tracker.actions.ShowAllItems;
import ru.job4j.tracker.actions.EditItem;

/**
 * Класс Menu -- меню программы.
 *
 * @author apetrov
 * @version 1
 * @since 28.03.2017
 */
public class Menu {
    /** Количество пунктов в меню. */
    private static final int MENU_LENGHT = 7;
    /** Массив пунктов меню (действий). */
    private Action[] menuItems = new Action[MENU_LENGHT];
    /** Флаг выбора пункта "Выход из программы". */
    private boolean goExit = false;

    /**
     * Флаг "выход".
     *
     * @return "уже выход?"
     */
    public boolean isGoExit() {
        return goExit;
    }


    /**
     * Единственный экземпляр Menu.
     */
    private static Menu instance;

    /**
     * Конструктор Menu.
     * Реализация шаблона Singleton.
     * Exit -- всегда последний пункт меню!
     */
    private Menu() {
        menuItems[0] = new AddItem();
        menuItems[1] = new ShowAllItems();
        menuItems[2] = new EditItem();
        menuItems[3] = new DeleteItem();
        menuItems[4] = new FindItemById();
        menuItems[5] = new FindItemsByName();
        menuItems[6] = new ExitProgram();
    }

    /**
     * Ленивая инициализация Menu.
     * @return единственный экземпляр Menu.
     */
    static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    /**
     * Отображаем меню на экране.
     */
    public void showMenu() {
        System.out.println();
        for (int i = 0; i < MENU_LENGHT; i++) {
            System.out.println(menuItems[i].menuString());
        }
    }

    /**
     * Выбираем пункт меню.
     *
     * @param i       пункт, выбранный пользователем
     * @param input   система ввода
     * @param tracker трекер
     */
    public void select(int i, Input input, Tracker tracker) {
        menuItems[i].execute(input, tracker);
        if (i == menuItems.length - 1) {
            goExit = true;
        }
    }
}
