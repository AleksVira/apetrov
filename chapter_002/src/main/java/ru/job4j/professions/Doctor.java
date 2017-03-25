package ru.job4j.professions;

import java.util.Random;

/**
 * Класс Doctor, задача части 02, урок 3.
 *
 * @author apetrov
 * @version 1
 * @since 20.03.2017
 */


class Doctor extends Person {
    /** Опыт работы. */
    private int medicalExperience;
    /** Диплом медицинского ВУЗа. */
    private String diploma;

    /**
     * Конструктор доктора.
     *
     * @param name   -- имя
     * @param age    -- возраст
     * @param salary -- зарплата
     */
    Doctor(String name, int age, int salary) {
        super(name, age, salary);
        this.medicalExperience = new Random().nextInt(20);
    }

    /**
     * Доктор ставит диагноз.
     *
     * @return название болезни
     */
    String diagnose() {
        String illness = "ветрянка";
        return ("Доктор " + this.getName() + " диагностировал " + illness);
    }

    /**
     * Доктор лечит пациента.
     *
     * @param person -- пациент
     * @return строка: кто лечит кого
     */
    String heal(Person person) {
        return ("Доктор " + this.getName() + " лечит пациента " + person.getName());
    }

    /**
     * Доктор назначает лекарство.
     *
     * @param person -- пациент
     * @return назначенное лекарство
     */
    String prescribeMedicine(Person person) {
        String medicine = "витамины";
        return ("Доктор " + this.getName() + " назначил пациенту " + person.getName() + " лекарство " + medicine);
    }
}
