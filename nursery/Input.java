package nursery;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }
    public String inputParameter(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
