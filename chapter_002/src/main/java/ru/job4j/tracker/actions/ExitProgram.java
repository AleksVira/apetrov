package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;

/**
 * Класс ExitProgram -- организация выхода из программы.
 *
 * @author apetrov
 * @version 1
 * @since 27.03.2017
 */
public class ExitProgram extends Action {

    /** Конструктор нового ExitProgram. */
    public ExitProgram() {
        super("Exit program");
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String answer = input.ask("Are you really want to exit? (Y/N or y/n): ");
        if (answer.toLowerCase().equals("y")) {
            System.out.println("Exit program, bye!");
        }
    }
}
