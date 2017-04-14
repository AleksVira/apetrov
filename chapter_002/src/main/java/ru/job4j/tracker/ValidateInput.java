package ru.job4j.tracker;

/**
 * Класс ValidateInput -- организация ввода данных с консоли, теперь с проверкой на допустимые значения.
 *
 * @author apetrov
 * @version 1
 * @since 10.04.2017
 */
public class ValidateInput extends ConsoleInput {
    @Override
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select correct key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter valid date again.");
            }

        } while (invalid);
        return value;
    }
}
