package ru.job4j.professions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


/**
 * Тесты класса Teacher.
 *
 * @author apetrov
 * @version 1
 * @since 20.03.2017
 */

public class TeacherTest {
    /** Проверка что учитель учит ученика. */
    @Test
    public void teachTest() {
        Teacher teacher = new Teacher("Петров", 25, 20);
        String expectString = "Учитель " + "Петров" + " учит ученика " + "Савин";
        assertThat(teacher.teach("Савин"), is(expectString));
    }

    /** Проверка что учитель принял домашнюю работу. */
    @Test
    public void assignHomework() {
        Teacher teacher = new Teacher("Марков", 30, 20);
        String expectString = "Задание от ученика " + "Пахомов" + " принято";
        assertThat(teacher.assignHomework("Пахомов"), is(expectString));
    }

    /** Проверка что учитель проверил домашнюю работу. */
    @Test
    public void checkHomework() {
        Teacher teacher = new Teacher("Андреев", 32, 20);
        String expectString = "Учитель " + "Андреев" + " проверил домашнее задание ученика " + "Орехов";
        assertThat(teacher.checkHomework("Орехов"), is(expectString));
    }

    /** Учитель ставит оценку. */
    @Test
    public void evaluate() {
        Teacher teacher = new Teacher("Андреев", 32, 20);
        for (int i = 0; i < 10; i++) {
            assertTrue(teacher.evaluate() >= 1 && teacher.evaluate() <= 5);
        }
    }

}