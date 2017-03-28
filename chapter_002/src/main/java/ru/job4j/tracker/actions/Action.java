package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;

/**
 * Класс Action, родительский для всех user-Action.
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public abstract class Action {
    /** Счетчик созданных наследников. */
    private static int actionsCounter = -1;
    {
        actionsCounter++;
    }

    /** Имя действия. */
    private String name;
    /** Ключ действия. */
    private int actionKey = actionsCounter;

    public int getActionKey() {
        return actionKey;
    }


    /**
     * Конструктор нового Action.
     *
     * @param name - имя Action
     */
    Action(String name) {
        this.name = name;
    }

    /**
     * Вывод текста для отображения меню.
     * Если пунктов > 9, будет 2 знака для числа.
     *
     * @return - строка пункта меню, с номером.
     */
    public String menuString() {
        if (actionsCounter > 9) {
            return String.format("%2d. %s", this.actionKey, this.name);
        } else {
            return String.format("%d. %s", this.actionKey, this.name);
        }

    }

    /**
     * Абстрактный метод execute, у каждого Action он будет свой.
     *
     * @param input   - input
     * @param tracker - tracker
     */
    public abstract void execute(Input input, Tracker tracker);

}
