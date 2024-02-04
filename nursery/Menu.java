package nursery;

public class Menu {
    private Update update;
    private DelAnimal delAnimal;
    private Exit exit;
    private ShowAnimals showAnimals;
    private Input input;
    private AddAnimal addAnimal;

    public Menu(Update update, DelAnimal delAnimal, Exit exit, ShowAnimals showAnimals, Input input, AddAnimal addAnimal) {
        this.update = update;
        this.delAnimal = delAnimal;
        this.exit = exit;
        this.showAnimals = showAnimals;
        this.input = input;
        this.addAnimal = addAnimal;
    }

    public void showMenu() {
        String number;
        System.out.print("\"Реестр животных в питомнике\"\n\nГЛАВНОЕ МЕНЮ\nВведите число и нажмите \"Enter\":\n1 - Добавить новое животное\n2 - Вывести спиок всех животных\n" +
                "3 - Обучить животное новым командам\n4 - Удалить животное из реестра\n0 - Выход из программы\n" +
                "DELETE123456789 - Код удаления данных. ОСТОРОЖНО!!! Это приведет к удалению всех данных\n");
        while (true) {
            number = input.inputParameter("Введите число: ");
            switch (number) {
                case "1":
                    addAnimal.createAnimal();
                    System.out.println("ЖИВОТНОЕ ЗАПИСАНО\n");
                    exit.exitProgram();
                    break;
                case "2":
                    showAnimals.show();
                    exit.exitProgram();
                    break;
                case "3":
                    update.updateInstructions();
                    exit.exitProgram();
                    break;
                case "4":
                    delAnimal.deleteAnimal();
                    exit.exitProgram();
                    break;
                case "DELETE123456789":
                    DelAll delAll = new DelAll();
                    delAll.clearFile();
                    break;
                case "0":
                    System.out.println("Выход");
                    System.exit(0);
                default:
                    System.out.println("Неверный формат ввода! Введите параметр снова");
                    break;
            }
        }
    }
}
