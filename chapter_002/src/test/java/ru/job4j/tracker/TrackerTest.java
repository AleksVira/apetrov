package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты классв Tracker.
 *
 * @author apetrov
 * @version 1
 * @since 23.03.2017
 */
public class TrackerTest {

    /** Тест добавления одного элемента в пустой трекер. */
    @Test
    public void testAddOneItemInEmptyTracker() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("name1", "description1", 1);
        tracker.addItem(item1);
        assertThat(tracker.findAll()[0], is(item1));
    }

    /** Тест добавления двух элементов в пустой трекер. */
    @Test
    public void testAddTwoItemsInEmptyTracker() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("name1", "description1", 1);
        Item item2 = new Item("name2", "description2", 2);
        tracker.addItem(item1);
        tracker.addItem(item2);
        assertThat(tracker.findAll()[0], is(item1));
        assertThat(tracker.findAll()[1], is(item2));
    }

    /** Тест изменения размера массива трекера при заполнении. */
    @Test
    public void testAddOneMoreThenLength() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("name1", "description1", 1);
        Item item2 = new Item("name2", "description2", 2);
        Item item3 = new Item("name3", "description3", 3);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.addItem(item3);
        assertThat(tracker.findAll()[0], is(item1));
        assertThat(tracker.findAll()[1], is(item2));
        assertThat(tracker.findAll()[2], is(item3));
    }

    /** Тест функции Update. */
    @Test
    public void testUpdateSecond() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("name1", "description1", 1);
        Item item2 = new Item("name2", "description2", 2);
        Item item3 = new Item("name3", "description3", 3);
        tracker.addItem(item1);
        tracker.addItem(item2);
        item3.setId(item2.getId());
        tracker.update(item3);
        assertThat(tracker.findAll()[0], is(item1));
        assertThat(tracker.findAll()[1], is(item3));
    }

    /** Тест функции Delete. */
    @Test
    public void testDelete() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("name1", "description1", 1);
        Item item2 = new Item("name2", "description2", 2);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.delete(item1);
        assertThat(tracker.findAll()[0], is(item2));
    }

    /** Тест функции addItem после Update. */
    @Test
    public void testAddAfterDelete() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("name1", "description1", 1);
        Item item2 = new Item("name2", "description2", 2);
        Item item3 = new Item("name3", "description3", 3);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.delete(item1);
        tracker.addItem(item3);
        assertThat(tracker.findAll()[0], is(item2));
        assertThat(tracker.findAll()[1], is(item3));
    }

    /** Тест функции FindAll. */
    @Test
    public void testFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("name1", "description1", 1);
        Item item2 = new Item("name2", "description2", 2);
        Item item3 = new Item("name3", "description3", 3);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.addItem(item3);
        Item[] expected = tracker.findAll();
        assertThat(new Item[]{item1, item2, item3}, is(expected));
    }

    /** Тест функции FindByName. */
    @Test
    public void testFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("name2", "description1", 1);
        Item item2 = new Item("name2", "description2", 2);
        Item item3 = new Item("name3", "description3", 3);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.addItem(item3);
        Item[] expected = tracker.findByName("name2");
        assertThat(new Item[]{item1, item2}, is(expected));
    }

    /** Тест функции FindById. */
    @Test
    public void testFindById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("name1", "description1", 1);
        Item item2 = new Item("name2", "description2", 2);
        Item item3 = new Item("name3", "description3", 3);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.addItem(item3);
        Item expected = tracker.findById(item3.getId());
        assertThat(item3, is(expected));
    }
}