package ru.job4j.professions;

import java.util.Random;

/**
 * Класс Teacher, задача части 02, урок 3.
 *
 * @author apetrov
 * @version 1
 * @since 20.03.2017
 */
class Teacher extends Person {
    /** Опыт работы. */
    private int workingExperience;
    /** Есть ли высшее образование? */
    private boolean higherEducation;

    /**
     * Конструктор учителя.
     * Опыт работы назначается случайно, высшее образование считаем что есть.
     *
     * @param name   -- имя
     * @param age    -- возраст
     * @param salary -- зарплата
     */
    Teacher(String name, int age, int salary) {
        super(name, age, salary);
        this.workingExperience = new Random().nextInt(10);
        this.higherEducation = true;
    }

    /**
     * Кто кого учит.
     *
     * @param pupil -- имя ученика
     * @return какой учитель кого учит
     */
    String teach(String pupil) {
        return ("Учитель " + this.getName() + " учит ученика " + pupil);
    }

    /**
     * От кого принимает задание.
     *
     * @param pupil -- имя ученика
     * @return строка о принятии задания от ученика
     */
    String assignHomework(String pupil) {
        return ("Задание от ученика " + pupil + " принято");
    }

    /**
     * Проверка домашнего задания выполнена.
     *
     * @param pupil -- имя ученика.
     * @return какой учитель проверил чьё задание
     */
    String checkHomework(String pupil) {
        return ("Учитель " + this.getName() + " проверил домашнее задание ученика " + pupil);
    }

    /**
     * Учитель выставляет оценку ученику.
     *
     * @return оценка за домашнее задание
     */
    int evaluate() {
        int score;
        score = new Random().nextInt(4) + 1;
        return score;
    }
}
