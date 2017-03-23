package ru.job4j.professions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты класса Engineer.
 *
 * @author apetrov
 * @version 1
 * @since 21.03.2017
 */
public class EngineerTest {

    /** Проверка чтения документации. */
    @Test
    public void testReadDocumentation() {
        Engineer engineer = new Engineer("Комаров", 35, 45);
        String expectString = "Инженер " + "Комаров" + " прочитал документацию к проекту " + "насосная станция";
        assertThat(engineer.readDocumentation("насосная станция"), is(expectString));
    }

    /** Проверка расчета по проекту. */
    @Test
    public void testCalculate() {
        Engineer engineer = new Engineer("Турова", 30, 44);
        String expectString = "Инженер " + "Турова" + " сделал расчет проекта " + "водокачка";
        assertThat(engineer.calculate("водокачка"), is(expectString));
    }

    /** Проверка что инженер помог кому-то по проекту. */
    @Test
    public void testHelp() {
        Engineer engineer = new Engineer("Баранов", 40, 50);
        String expectString = "Инженер " + "Баранов" + " помог " + "Беспалов" + " по проекту";
        assertThat(engineer.help("Беспалов"), is(expectString));
    }
}
