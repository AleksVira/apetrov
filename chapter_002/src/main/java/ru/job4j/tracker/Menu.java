package ru.job4j.tracker;

/**
 * Класс Menu -- меню программы.
 *
 * @author apetrov
 * @version 1
 * @since 28.03.2017
 */
public class Menu {
    /** Количество пунктов в меню. */
    private static final int MENU_LENGHT = 7;
    /** Массив пунктов меню (действий). */
    private Action[] menuItems = new Action[MENU_LENGHT];
    /** Флаг выбора пункта "Выход из программы". */
    private boolean goExit = false;

    /**
     * Флаг "выход".
     *
     * @return "уже выход?"
     */
    boolean isGoExit() {
        return goExit;
    }


    /**
     * Единственный экземпляр Menu.
     */
    private static Menu instance;

    /**
     * Конструктор Menu.
     * Реализация шаблона Singleton.
     * Exit -- всегда последний пункт меню!
     */
    private Menu() {
        menuItems[0] = new AddItem();
        menuItems[1] = new ShowAllItems();
        menuItems[2] = new EditItem();
        menuItems[3] = new DeleteItem();
        menuItems[4] = new FindItemById();
        menuItems[5] = new FindItemsByName();
        menuItems[6] = new ExitProgram();
    }

    /**
     * Ленивая инициализация Menu.
     *
     * @return единственный экземпляр Menu.
     */
    static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    /** Отображаем меню на экране. */
    void showMenu() {
        System.out.println();
        for (int i = 0; i < MENU_LENGHT; i++) {
            System.out.println(menuItems[i].menuString());
        }
    }

    /**
     * Выбираем пункт меню.
     *
     * @param i       пункт, выбранный пользователем
     * @param input   система ввода
     * @param tracker трекер
     */
    void select(int i, Input input, Tracker tracker) {
        menuItems[i].execute(input, tracker);
        if (i == menuItems.length - 1) {
            goExit = true;
        }
    }

    /** Класс AddItem -- добавление нового элемента в трекер. */
    private class AddItem extends Action {

        /** Конструктор нового AddItem. */
        AddItem() {
            super("Add new Item");
        }

        /**
         * Реализация абстрактного метода.
         *
         * @param input   система ввода
         * @param tracker трекер
         */
        public void execute(Input input, Tracker tracker) {
            String itemName = input.ask("Enter the name of the new Item: ");
            String itemDescription = input.ask("Enter the description of the new Item: ");
            tracker.addItem(new Item(itemName, itemDescription, System.currentTimeMillis()));
        }
    }

    /** Класс ShowAllItems -- отображение всех элементов в трекере. */
    private class ShowAllItems extends Action {

        /** Конструктор нового ShowAllItems. */
        ShowAllItems() {
            super("Show all items");
        }

        /**
         * Реализация абстрактного метода.
         *
         * @param input   система ввода
         * @param tracker трекер
         */
        public void execute(Input input, Tracker tracker) {
            if (tracker.getPointer() == 0) {
                System.out.println("Tracker is empty!");
                return;
            }
            for (Item item : tracker.findAll()) {
                System.out.println();
                item.printInfo();
            }
        }
    }

    /** Класс EditItem -- редактирование элемента в трекере. */
    private class EditItem extends Action {

        /** Конструктор нового Edit item. */
        EditItem() {
            super("Edit item");
        }

        /**
         * Реализация абстрактного метода.
         *
         * @param input   система ввода
         * @param tracker трекер
         */
        public void execute(Input input, Tracker tracker) {
            String idToEdit = input.ask("Enter the ID of the item to edit: ");
            if (tracker.findById(idToEdit) != null) {
                String newName = input.ask("Enter the new name of this Item: ");
                String newDescription = input.ask("Enter the new description of this Item: ");
                Item item = new Item(newName, newDescription, System.currentTimeMillis());
                item.setId(idToEdit);
                tracker.update(item);
            } else {
                System.out.println("Item with this ID does not exist.");
            }
        }
    }

    /** Класс DeleteItem -- удаление элемента в трекере. */
    private class DeleteItem extends Action {

        /** Конструктор Delete item. */
        DeleteItem() {
            super("Delete item");
        }

        /**
         * Реализация абстрактного метода.
         *
         * @param input   система ввода
         * @param tracker трекер
         */
        public void execute(Input input, Tracker tracker) {
            String idToDelete = input.ask("Enter the ID of the item to remove: ");
            if (tracker.findById(idToDelete) != null) {
                Item itemToDel = tracker.findById(idToDelete);
                tracker.delete(itemToDel);
            } else {
                System.out.println("Item with this ID does not exist.");
            }
        }
    }

    /** Класс FindItemById -- поиск элемента по ID. */
    private class FindItemById extends Action {

        /** Конструктор нового FindItemById. */
        FindItemById() {
            super("Find item by Id");
        }

        /**
         * Реализация абстрактного метода.
         *
         * @param input   система ввода
         * @param tracker трекер
         */
        public void execute(Input input, Tracker tracker) {
            String idToFind = input.ask("Enter the ID of the desired item: ");
            if (tracker.findById(idToFind) != null) {
                Item itemToFind = tracker.findById(idToFind);
                itemToFind.printInfo();
            } else {
                System.out.println("Item with this ID does not exist.");
            }


        }
    }

    /** Класс FindItemById -- поиск элемента по имени (name). */
    private class FindItemsByName extends Action {

        /** Конструктор нового FindItemsByName. */
        FindItemsByName() {
            super("Find items by name");
        }

        /**
         * Реализация абстрактного метода.
         *
         * @param input   система ввода
         * @param tracker трекер
         */
        public void execute(Input input, Tracker tracker) {
            String nameToFind = input.ask("Enter the name of the desired items: ");
            Item[] searchResult = tracker.findByName(nameToFind);
            if (searchResult.length != 0) {
                for (Item item : searchResult) {
                    System.out.println();
                    item.printInfo();
                }
            } else {
                System.out.println("There is no items with that name.");
            }
        }
    }

    /** Класс ExitProgram -- организация выхода из программы. */
    private class ExitProgram extends Action {

        /** Конструктор нового ExitProgram. */
        ExitProgram() {
            super("Exit program");
        }

        /**
         * Реализация абстрактного метода.
         *
         * @param input   система ввода
         * @param tracker трекер
         */
        public void execute(Input input, Tracker tracker) {
            String answer = input.ask("Are you really want to exit? (Y/N or y/n): ");
            if (answer.toLowerCase().equals("y")) {
                System.out.println("Exit program, bye!");
            }
        }
    }

}

