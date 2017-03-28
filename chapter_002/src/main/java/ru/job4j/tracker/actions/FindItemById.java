package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * Класс FindItemById -- поиск элемента по ID.
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public class FindItemById extends Action {

    /** Конструктор нового FindItemById. */
    public FindItemById() {
        super("Find item by Id");
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String idToFind = input.ask("Enter the ID of the desired item: ");
        if (tracker.findById(idToFind) != null) {
            Item itemToFind = tracker.findById(idToFind);
            itemToFind.printInfo();
        } else {
            System.out.println("Item with this ID does not exist.");
        }



    }
}
