package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * Класс AddItem -- добавление нового элемента в трекер.
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public class AddItem extends Action {

    /** Конструктор нового AddItem. */
    public AddItem() {
        super("Add new Item");
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String itemName = input.ask("Enter the name of the new Item: ");
        String itemDescription = input.ask("Enter the description of the new Item: ");
        tracker.addItem(new Item(itemName, itemDescription, System.currentTimeMillis()));
    }
}
