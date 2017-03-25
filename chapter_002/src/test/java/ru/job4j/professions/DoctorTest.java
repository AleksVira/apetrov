package ru.job4j.professions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты класса Doctor .
 *
 * @author apetrov
 * @version 1
 * @since 21.03.2017
 */
public class DoctorTest {

    /** Проверка что доктор ставит диагноз. */
    @Test
    public void testDiagnose() {
        Doctor doc = new Doctor("Логинов", 40, 60);
        String expectString = "Доктор " + "Логинов" + " диагностировал " + "ветрянка";
        assertThat(doc.diagnose(), is(expectString));
    }

    /** Проверка что доктор лечит пациента. */
    @Test
    public void testHeal() {
        Doctor doc = new Doctor("Блинов", 38, 55);
        Person pers = new Person("Щербаков", 25, 0);
        String expectString = "Доктор " + "Блинов" + " лечит пациента " + "Щербаков";
        assertThat(doc.heal(pers), is(expectString));
    }

    /** Проверка что доктор назначил лекарство. */
    @Test
    public void testPrescribeMedicine() {
        Doctor doc = new Doctor("Мишин", 45, 75);
        Person pers = new Person("Больнов", 30, 0);
        String expectString = "Доктор " + "Мишин" + " назначил пациенту " + "Больнов" + " лекарство " + "витамины";
        assertThat(doc.prescribeMedicine(pers), is(expectString));
    }
}