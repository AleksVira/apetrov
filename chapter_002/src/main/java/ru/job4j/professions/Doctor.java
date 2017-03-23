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
     * @param patient -- пациент
     * @return строка: кто лечит кого
     */
    String heal(String patient) {
        return ("Доктор " + this.getName() + " лечит " + patient);
    }

    /**
     * Доктор назначает лекарство.
     *
     * @param patient -- пациент
     * @return назначенное лекарство
     */
    String prescribeMedicine(String patient) {
        String medicine = "витамины";
        return ("Доктор " + this.getName() + " назначил пациенту " + patient + " лекарство " + medicine);
    }
}
