package ru.job4j.tracker;

/**
 * Класс Item, задача части 02, урок 4.
 * Элемент хранилища (запись)
 *
 * @author apetrov
 * @version 1
 * @since 23.03.2017
 */
public class Item {
    /** Уникальный для каждой заявки ID. */
    private String id;
    /** Имя заявки (не уникальное). */
    private String name;
    /** Описание заявки. */
    private String description;
    /** Время создания заявки. */
    private long create;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getCreate() {
        return create;
    }

    /**
     * Конструктор новой заявки.
     *
     * @param name        имя
     * @param description описание
     * @param create      дата создания
     */
    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }
}
