package nursery;

public class Exit {
    private Input input;

    public Exit(Input input) {
        this.input = input;
    }

    public void exitProgram() {
        String number;
        while (true) {
            System.out.println("Введите число и нажмите \"Enter\"\nДля продолжения введите - 1\nДля выхода из программы введите - 0\n");
            number = input.inputParameter("Введите число: ");
            switch (number) {
                case "1":
                    System.out.println("Введите параметр из главного меню для выбора нового действия");
                    return;
                case "0":
                    System.out.println("Выход");
                    System.exit(0);
                default:
                    System.out.println("Неверный формат ввода!");
            }
        }
    }
}
