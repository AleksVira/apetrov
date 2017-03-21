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
        String expectString = "Доктор " + "Блинов" + " лечит " + "Щербакова";
        assertThat(doc.heal("Щербакова"), is(expectString));
    }

    /** Проверка что доктор назначил лекарство. */
    @Test
    public void testPrescribeMedicine() {
        Doctor doc = new Doctor("Мишин", 45, 75);
        String expectString = "Доктор " + "Мишин" + " назначил " + "витамины";
        assertThat(doc.prescribeMedicine(), is(expectString));
    }
}