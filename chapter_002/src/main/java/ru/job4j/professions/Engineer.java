package ru.job4j.professions;

import java.util.Random;

/**
 * Класс Engineer, задача части 02, урок 3.
 *
 * @author apetrov
 * @version 1
 * @since 20.03.2017
 */

class Engineer extends Person {
    /** Опыт работы. */
    private int experience;
    /** Инженерная специальность. */
    private String specialty;

    /**
     * Конструктор инженера.
     * Опыт работы назначается случайно, высшее образование считаем что есть.
     *
     * @param name   -- имя
     * @param age    -- возраст
     * @param salary -- зарплата
     */
    Engineer(String name, int age, int salary) {
        super(name, age, salary);
        this.experience = new Random().nextInt(15);
    }

    /**
     * Инженер читает документацию.
     * @param projectName -- название проекта
     * @return кто прочитал документацию
     */
    String readDocumentation(String projectName) {
        return ("Инженер " + this.getName() + " прочитал документацию к проекту " + projectName);
    }

    /**
     * Инженер делает расчет по проекту.
     * @param projectName -- название проекта
     * @return кто сделал расчет какого проекта
     */
    String calculate(String projectName) {
        return ("Инженер " + this.getName() + " сделал расчет проекта " + projectName);
    }

    /**
     * Инженер помогает кому-то по проекту.
     * @param person -- кому помогает инженер
     * @return кому помог инженер по проекту
     */
    String help(Person person) {
        return ("Инженер " + this.getName() + " помог " + person.getName() + " по проекту");
    }
}
