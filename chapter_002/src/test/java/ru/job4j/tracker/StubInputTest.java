package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты, имитирующие ввод пользователя.
 *
 * @author apetrov
 * @version 1
 * @since 03.04.2017
 */
public class StubInputTest {
    /** Трекер для хранения заявок. */
    private Tracker tracker = new Tracker();
    /** Система ввода-вывода данных. */
    private Input input;

    /** Тест добавления одного элемента в пустой трекер. */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        input = new StubInput(new String[]{"0", "123name", "123desc", "6", "Y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("123name"));
    }

    /** Тест: добавление двух элементов в пустой трекер, затем удаление первого. */
    @Test
    public void whenUserAddTwoItemsAndDeleteFirst() {
        tracker.addItem(new Item("123name", "123desc", 1));
        tracker.addItem(new Item("456name", "456desc", 2));
        String deletedID = tracker.findAll()[0].getId();
        input = new StubInput(new String[]{"3", deletedID, "1", "6", "Y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("456name"));
    }

    /** Тест: добавление двух элементов в пустой трекер, затем редактирование второго элемента. */
    @Test
    public void whenUserAddTwoItemsAndUpdateSecond() {
        tracker.addItem(new Item("987name", "987desc", 3));
        tracker.addItem(new Item("654name", "654desc", 4));
        String updatedID = tracker.findAll()[1].getId();
        input = new StubInput(new String[]{"2", updatedID, "111name", "111desc", "6", "Y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[1].getName(), is("111name"));
    }
}
