package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * Класс DeleteItem -- удаление элемента в трекере.
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public class DeleteItem extends Action {

    /**
     * Конструктор Delete item.
     */
    public DeleteItem() {
        super("Delete item");
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String idToDelete = input.ask("Enter the ID of the item to remove: ");
        if (tracker.findById(idToDelete) != null) {
            Item itemToDel = tracker.findById(idToDelete);
            tracker.delete(itemToDel);
        } else {
            System.out.println("Item with this ID does not exist.");
        }
    }
}
