package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * Класс ShowAllItems -- отображение всех элементов в трекере.
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public class ShowAllItems extends Action {

    /** Конструктор нового ShowAllItems. */
    public ShowAllItems() {
        super("Show all items");
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        if (tracker.getPointer() == 0) {
            System.out.println("Tracker is empty!");
            return;
        }
        for (Item item: tracker.findAll()) {
            System.out.println();
            item.printInfo();
        }
    }
}
