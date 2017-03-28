package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * Класс FindItemById -- поиск элемента по имени (name).
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public class FindItemsByName extends Action {

    /** Конструктор нового FindItemsByName. */
    public FindItemsByName() {
        super("Find items by name");
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String nameToFind = input.ask("Enter the name of the desired items: ");
        Item[] searchResult = tracker.findByName(nameToFind);
        if (searchResult.length != 0) {
            for (Item item : searchResult) {
                System.out.println();
                item.printInfo();
            }
        } else {
            System.out.println("There is no items with that name.");
        }
    }
}
