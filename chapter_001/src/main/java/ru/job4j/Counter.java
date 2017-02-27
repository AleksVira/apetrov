package ru.job4j;

/**
 * Class Counter, задача "4.1. Подсчет суммы в диапазоне".
 *
 * @author apetrov
 * @version 1
 * @since 24.02.2017
 */
public class Counter {

    /**
     * Сумма четных чисел в заданном диапазоне (включая верхнюю границу).
     * Если finish < start, вернет -1; если finish = start, вернет 0
     * @param start  - начало диапазона
     * @param finish - конец диапазона
     * @return Сума четных чисел
     */
    public int add(int start, int finish) {
        if (finish < start) {
            return -1;
        } else if (start == finish) {
            return 0;
        } else {
            int myCounter = 0;
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    myCounter += i;
                }
            }
            return myCounter;
        }
    }
}