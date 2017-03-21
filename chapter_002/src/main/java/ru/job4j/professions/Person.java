package ru.job4j.professions;

/**
 * Класс Person, задача части 02, урок 3.
 *
 * @author apetrov
 * @version 1
 * @since 20.03.2017
 */

class Person {
    /** Имя человека. */
    private String name;
    /** Возраст человека. */
    private int age;
    /** Зарплата человека. */
    private int salary;

    /**
     * Конструктор человека.
     *
     * @param name   -- имя
     * @param age    -- возраст
     * @param salary -- зарплата
     */

    Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Геттер для "name".
     *
     * @return имя человека
     */
    String getName() {
        return name;
    }
}
