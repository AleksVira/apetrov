package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * Класс EditItem -- редактирование элемента в трекере.
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public class EditItem extends Action {

    /** Конструктор нового Edit item. */
    public EditItem() {
        super("Edit item");
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String idToEdit = input.ask("Enter the ID of the item to edit: ");
        if (tracker.findById(idToEdit) != null) {
            String newName = input.ask("Enter the new name of this Item: ");
            String newDescription = input.ask("Enter the new description of this Item: ");
            Item item = new Item(newName, newDescription, System.currentTimeMillis());
            item.setId(idToEdit);
            tracker.update(item);
        } else {
            System.out.println("Item with this ID does not exist.");
        }
    }
}
