package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Класс Tracker, задача части 02, урок 4.
 *
 * @author apetrov
 * @version 1
 * @since 23.03.2017
 */
public class Tracker {
    /** Хранилище заявок. */
    private Item[] items = new Item[2];
    /** Количество уже заполненных ячеек. */
    private int pointer = 0;
    /** Константа для генерации уникального ID. */
    private static final Random RND = new Random();


    /**
     * Добавить элемент в хранилище.
     *
     * @param item - добавляемый элемент
     */
    public void addItem(Item item) {
        if (pointer == items.length - 1) {
            items = Arrays.copyOf(items, (int) (1.5 * items.length));
        }
        item.setId(generateId());
        this.items[pointer++] = item;
    }

    /**
     * Заменить элемент в хранилище.
     *
     * @param item - то, чем заменяем элемент с таким же ID
     */
    public void update(Item item) {
        String idToUpdate = item.getId();
        for (int i = 0; i <= pointer; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(idToUpdate)) {
                this.items[i] = item;
                break;
            }
        }
    }

    /**
     * Удалить элемент в хранилище.
     *
     * @param item - удаляемый элемент
     */
    public void delete(Item item) {
        String idToDelete = item.getId();
        for (int i = 0; i <= pointer; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(idToDelete)) {
                this.items[i] = this.items[pointer - 1];
                this.items[pointer - 1] = null;
                pointer--;
                break;
            }
        }
    }


    /**
     * Вернуть массив из непустых элементов в хранилище.
     *
     * @return - возвращает массив Item
     */
    public Item[] findAll() {
        Item[] result = new Item[this.pointer];
        for (int i = 0; i < this.pointer; i++) {
            if (this.items[i] != null) {
                result[i] = this.items[i];
            }
        }
        return result;
    }

    /**
     * Найти элемент по полю "name".
     *
     * @param key - текст для поиска
     * @return - возвращает нужный элемент.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.pointer];
        int newPointer = 0;
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                result[newPointer] = item;
                newPointer++;
            }
        }
        result = Arrays.copyOf(result, newPointer);
        return result;
    }

    /**
     * Найти элемент по ID.
     *
     * @param id - указываем ID
     * @return - возвращаемый элемент
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Генерирует ID.
     *
     * @return - ID
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RND.nextInt());
    }

    public int getPointer() {
        return pointer;
    }

}
